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

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://gasfdbvr.vr.de/privatkunden.html')

WebUI.setText(findTestObject('06VR/Page_Privatkunden - Volksbanken Rai/input_q'), '10555')

WebUI.delay(1)

WebUI.click(findTestObject('06VR/Page_Privatkunden - Volksbanken Rai/span_Suchen'))

WebUI.delay(1)

WebUI.click(findTestObject('03_gasf/Page_Karriere - Volksbanken Raiffei (1)/a_Firmenkunden'))

WebUI.delay(1)

WebUI.click(findTestObject('06VR/Page_Firmenkunden - Volksbanken Rai/a_Schlieen'))

WebUI.delay(1)

WebUI.click(findTestObject('03_gasf/Page_Karriere - Volksbanken Raiffei (1)/a_Junge Kunden'))

WebUI.delay(1)

WebUI.click(findTestObject('06VR/Page_Junge Kunden - Volksbanken Rai/a_Schlieen'))

WebUI.delay(1)

WebUI.click(findTestObject('03_gasf/Page_Karriere - Volksbanken Raiffei/a_Privatkunden'))

WebUI.delay(1)

WebUI.click(findTestObject('06VR/Page_Privatkunden - Volksbanken Rai/a_Schlieen'))

WebUI.delay(1)

WebUI.closeBrowser()

