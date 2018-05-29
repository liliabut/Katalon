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

WebUI.click(findTestObject('x/Page_Privatkunden - Volksbanken Rai/a_Schlieen'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Privatkunden - Volksbanken Rai/a_nav__link--lvl-2 icons-navig'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Privatkunden - Volksbanken Rai/a_nav__link--lvl-2 icons-navig'))

WebUI.delay(2)

WebUI.click(findTestObject('vr01/Page_Privatkunden - Volksbanken Rai/a_btn btn--contact'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Berliner Volksbank eGWittestr./button_Absenden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bitte geben Sie Ihren Namen an.', false)

WebUI.delay(2)

WebUI.verifyTextPresent('Bitte geben Sie Ihre E-Mail-Adresse an.', false)

WebUI.verifyTextPresent('Bitte geben Sie eine Nachricht ein.', false)

WebUI.verifyTextPresent('Bitte bestätigen Sie Ihr Einverständnis zur Speicherung der Daten.', false)

WebUI.setText(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/input_name'), 'Max')

WebUI.delay(2)

WebUI.setText(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/input_email'), 'Mustermann')

WebUI.delay(2)

WebUI.verifyTextPresent('Bitte geben Sie eine gültige E-Mail-Adresse ein.', false)

WebUI.setText(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/textarea_message'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Berliner Volksbank eGWittestr./button_Absenden'))

WebUI.delay(2)

WebUI.click(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/svg_icon-check'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/input_wccheck'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Berliner Volksbank eGWittestr./button_Absenden'))

WebUI.setText(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/input_email'), 'Mustermann@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('vr01/Page_Zentrales Kontaktformular - Vo/svg_icon-check'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Berliner Volksbank eGWittestr./button_Absenden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Vielen Dank für Ihre Nachricht!', false)

WebUI.closeBrowser()

