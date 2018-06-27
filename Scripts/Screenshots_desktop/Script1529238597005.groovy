import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.junit.After
import org.openqa.selenium.Capabilities
import org.openqa.selenium.remote.RemoteWebDriver

WebUI.openBrowser("")

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

// read JS to be done from script
String fromFile = RunConfiguration.getProjectDir() + GlobalVariable.hide_elements

FileReader fr = new FileReader(fromFile)
BufferedReader br = new BufferedReader(fr)

String buff = "";
ArrayList<String> js = new ArrayList<String>()

while ((buff = br.readLine()) != null) {
	buff = buff.trim().replace("\n", "").replace("\r", "");
	
	if(!buff.isEmpty() && !buff.startsWith("//")) {
		js.add(buff)
	}
}

br.close()
fr.close()

// open list of URLs
fromFile = RunConfiguration.getProjectDir() + GlobalVariable.urls_list

LocalDateTime current = LocalDateTime.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")
String formattedDate = current.format(formatter)

String browser = ((RemoteWebDriver)DriverFactory.getWebDriver()).getCapabilities().getBrowserName()

String toFolder = GlobalVariable.dump_folder + "_" + browser + "_" + formattedDate + "/"

fr = new FileReader(fromFile)
br = new BufferedReader(fr)

String url = ""
String native_url = ""

// targetDir is full path incl. dump folder + URL
while ((url = br.readLine()) != null) {
	native_url = url
	url = url.replaceAll("https://", "")
	url = url.replaceAll("http://", "")
	url = url.replaceAll("/", "\\\\")

	// remove last slash
	if (url.endsWith("\\")) {
		url = url.substring(0, url.length() - 1)
	}

	// maximal length of folder is set to 200 characters
	if (url.length() > 200) {
		url = url.substring(0, 199)
	}

	String targetDir = toFolder + url + "/desktop/"
	File toFile = new File(targetDir)
	
	if(!toFile.exists()) {
		toFile.mkdirs();
	}
	
	WebUI.navigateToUrl(native_url)
	
	WebUI.waitForPageLoad(10)
	
	WebDriver driver = DriverFactory.getWebDriver()
	
	for(String jst : js) {
		WebUI.executeJavaScript(jst, null)
	}
	
	WebUI.delay(5)
	
	for(String jst : js) {
		WebUI.executeJavaScript(jst, null)
	}		
	
	Screenshot screenshot
	
	if(browser.contains("safari")) {
		screenshot = new AShot().shootingStrategy(ShootingStrategies.scaling(2)).takeScreenshot(driver)
	} else {
		screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportRetina(100,0,0,2)).takeScreenshot(driver)
	}
	
	ImageIO.write(screenshot.getImage(), "PNG", new File(targetDir + "1.png"))
}

br.close()
fr.close()

WebUI.closeBrowser()