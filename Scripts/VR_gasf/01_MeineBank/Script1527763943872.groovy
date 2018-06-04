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

WebUI.click(findTestObject('01_gasf/Page_Karriere - Volksbanken Raiffei/img_logo-vr'))

WebUI.click(findTestObject('VR_MeineBank/Page_Privatkunden - Volksbanken Rai (1)/a_Mitgliedschaft'))

WebUI.delay(2)

WebUI.verifyTextPresent('Mitgliedschaft – mehr als nur Kunde sein', false)

WebUI.click(findTestObject('VR_MeineBank/Page_Mitgliedschaft - Volksbanken R (1)/div_MiasBensEmmasJonasHannahsL'))

WebUI.click(findTestObject('VR_MeineBank/Page_Mitgliedschaft - Volksbanken R (1)/a_Startseite'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bei welchen Zielen können wir Sie unterstützen?', false)

WebUI.click(findTestObject('01_gasf/Page_Karriere - Volksbanken Raiffei/img_logo-vr'))

WebUI.delay(2)

WebUI.verifyTextPresent('Startseite', false)

WebUI.click(findTestObject('VR_MeineBank/Page_Privatkunden - Volksbanken Rai (1)/button_Schlieen'))

WebUI.click(findTestObject('VR_MeineBank/Page_Privatkunden - Volksbanken Rai (1)/div_MiasBensEmmasJonasHannahsL'))

WebUI.verifyTextPresent('Mitgliedschaft', false)

WebUI.click(findTestObject('VR_MeineBank/Page_Privatkunden - Volksbanken Rai (1)/button_Schlieen'))

WebUI.closeBrowser()

