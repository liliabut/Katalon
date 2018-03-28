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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/filialsuche-wangen.html')

WebUI.delay(2)

WebUI.click(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Geschftsstelle Brtlingen'))

WebUI.delay(2)

WebUI.verifyTextPresent('Hauptstr. 56', false)

WebUI.verifyTextPresent('73104 Börtlingen', false)

WebUI.click(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Geschftsstelle Rechbergha'))

WebUI.delay(2)

WebUI.verifyTextPresent('Hauptstr. 37', false)

WebUI.verifyTextPresent('73098 Rechberghausen', false)

WebUI.scrollToElement(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Geschftsstelle Uhingen-Ho'), 0)

WebUI.click(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Geschftsstelle Uhingen-Ho'))

WebUI.delay(3)

WebUI.verifyTextPresent('Dorfstr. 17 a', false)

WebUI.verifyTextPresent('73066 Uhingen', false)

WebUI.scrollToElement(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Raiffeisenbank Wangen eG'), 0)

WebUI.click(findTestObject('16TF/Page_Filialsuche-wangen - BVR HTML/span_Raiffeisenbank Wangen eG'))

WebUI.delay(2)

WebUI.verifyTextPresent('Hauptstr.44', false)

WebUI.verifyTextPresent('73117 Wangen', false)

WebUI.closeBrowser()

