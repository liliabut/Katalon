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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/filialsuche.html')

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/a_Berliner Volksbank eG'))

WebUI.delay(2)

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.click(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy/button'))

WebUI.delay(2)

WebUI.click(findTestObject('filial_map - Copy'))

WebUI.delay(2)

WebUI.verifyTextPresent('030 3063-3300', false)

WebUI.verifyTextPresent('service@berliner-volksbank.de', false)

WebUI.delay(1)

WebUI.verifyElementInViewport(findTestObject('64_Filialsuche/Page_Filialsuche - BVR HTML Prototy (4)/div_Karl-Marx-Str. 3516816 Neu'), 
    0)

WebUI.closeBrowser()

