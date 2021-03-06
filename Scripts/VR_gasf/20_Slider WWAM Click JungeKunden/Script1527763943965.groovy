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

WebUI.navigateToUrl('https://gasfdbvr.vr.de/junge-kunden.html')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_PhishingAuch im Internet sin'))

WebUI.delay(1)

WebUI.verifyTextPresent('Phishing – Datendiebstahl im Internet', false)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Phishing - Volksbanken Raiffei/a_Junge Kunden'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Die Algerische Schlinge Blei'))

WebUI.delay(1)

WebUI.verifyTextPresent('Betrugsmasche Algerische Schlinge', false)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Betrugsmasche Algerische Schli/a_Junge Kunden'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Junge Kunden - Volksbanken Rai/a_Ablenkung am Geldautomaten S'))

WebUI.verifyTextPresent('Ablenkung am Geldautomaten', false)

WebUI.delay(1)

WebUI.click(findTestObject('20VR/Page_Ablenkung am Geldautomaten - V/a_Junge Kunden'))

WebUI.delay(1)

WebUI.closeBrowser()

