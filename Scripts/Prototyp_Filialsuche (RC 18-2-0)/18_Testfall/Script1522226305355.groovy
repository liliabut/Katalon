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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/filialsuche-rotenburg.html')

WebUI.waitForPageLoad(0)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_Bad Hersfeld'), 0)

WebUI.mouseOver(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_Bad Hersfeld'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_Bad Hersfeld (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_acc-wrapper'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/a_Anfahrt'))

WebUI.setText(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/input_street'), '10555')

WebUI.setText(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/input_city'), '10555')

WebUI.setText(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/input_street'), 'agricolastr')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/a_Zurck'))

WebUI.delay(5)

WebUI.click(findTestObject('18tt/Page_Filialsuche-rotenburg - BVR HT/div_ffnet eine Lightbox mit Ak'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/a_Anfahrt_1'))

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/a_Zurck'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('18tt/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'), 0)

WebUI.click(findTestObject('18tt/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.mouseOver(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_Kirchheim'))

WebUI.click(findTestObject('Object Repository/18tt/Page_Filialsuche-rotenburg - BVR HT/div_Kirchheim'))

WebUI.delay(5)

WebUI.verifyTextPresent('Hauptstr. 11', false)

WebUI.closeBrowser()

