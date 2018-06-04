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

WebUI.navigateToUrl('https://www.vr.de/privatkunden.html')

WebUI.click(findTestObject('SeitenanfangButton/Page_Privatkunden - Volksbanken Rai/button_SMS anfordern'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Privatkunden - Volksbanken Rai/a_Seitenanfang'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Privatkunden - Volksbanken Rai/a_Firmenkunden'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Firmenkunden - Volksbanken Rai (1)/img_module-lebenseinstieg--tea'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Existenzgrndung - Volksbanken/a_Checkliste Businessplan'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Existenzgrndung - Volksbanken/a_Seitenanfang'))

WebUI.delay(2)

WebUI.click(findTestObject('SeitenanfangButton/Page_Existenzgrndung - Volksbanken/a_Junge Kunden'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Junge Kunden - Volksbanken Rai (1)/img'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Fhrerschein machen - Volksbank/a_Fahren ab 17'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Fhrerschein machen - Volksbank/a_Seitenanfang'))

WebUI.delay(2)

WebUI.click(findTestObject('SeitenanfangButton/Page_Fhrerschein machen - Volksbank/a_Karriere'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Karriere - Volksbanken Raiffei/a_Erweiterte Suche'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Karriere - Volksbanken Raiffei/img'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Karrierechancen - Volksbanken/a_Check Passen Sie zu den Volk'))

WebUI.click(findTestObject('SeitenanfangButton/Page_Karrierechancen - Volksbanken/a_Seitenanfang'))

WebUI.closeBrowser()

WebUI.closeBrowser()

