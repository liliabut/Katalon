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

WebUI.click(findTestObject('Sticky-Nav/Page_Privatkunden - Volksbanken Rai/img'))

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Checkliste Hochzeit'))

WebUI.delay(2)

WebUI.verifyTextPresent('Checkliste: Kostenplanung für die Hochzeit', false)

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Steuertipps'))

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Hochzeit finanzieren'))

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Gemeinschaftskonto'))

WebUI.delay(2)

WebUI.verifyTextPresent('Gemeinschaftskonto und Finanzen in der Ehe', false)

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Seitenanfang'))

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Hochzeit finanzieren - Volksba/a_Privatkunden'))

WebUI.click(findTestObject('Sticky-Nav/Page_Privatkunden - Volksbanken Rai/img_1'))

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Wie viel Haus kann ich mir l'))

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Die monatliche Rate'))

WebUI.delay(2)

WebUI.verifyTextPresent('Wie hoch kann die monatliche Rate sein?', false)

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Passende Finanzierung finden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Welche Immobilienfinanzierung ist die beste?', false)

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Checkliste Haus finanzieren'))

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Haus kaufen'))

WebUI.delay(2)

WebUI.verifyTextPresent('Worauf Sie beim Hauskauf achten sollten', false)

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Seitenanfang'))

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Haus kaufen - Volksbanken Raif/a_Firmenkunden'))

WebUI.click(findTestObject('Sticky-Nav/Page_Firmenkunden - Volksbanken Rai/img_module-lebenseinstieg--tea'))

WebUI.click(findTestObject('Sticky-Nav/Page_Zahlungsverkehr fr Unternehmen/a_Liquiditt vorhalten und sich'))

WebUI.click(findTestObject('Sticky-Nav/Page_Zahlungsverkehr fr Unternehmen/a_Checkliste Zahlungsverkehr u'))

WebUI.click(findTestObject('Sticky-Nav/Page_Zahlungsverkehr fr Unternehmen/a_Zahlungsverkehr abwickeln'))

WebUI.click(findTestObject('Sticky-Nav/Page_Zahlungsverkehr fr Unternehmen/span_icons-top'))

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Zahlungsverkehr fr Unternehmen/a_Firmenkunden'))

WebUI.click(findTestObject('Sticky-Nav/Page_Firmenkunden - Volksbanken Rai/img_module-lebenseinstieg--tea_1'))

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Notfallordner erstellen'))

WebUI.verifyElementInViewport(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol (1)/span_Checkliste Notfallordner'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Zugriff auf Passwrter'))

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Vertretung organisieren'))

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Vollmachten einrichten'))

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Krankheit und Berufsunfhigke'))

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Seitenanfang'))

WebUI.click(findTestObject('Sticky-Nav/Page_Ausfall des Unternehmers - Vol/a_Junge Kunden'))

WebUI.click(findTestObject('Sticky-Nav/Page_Junge Kunden - Volksbanken Rai/img'))

WebUI.delay(15)

WebUI.click(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank/a_Kosten eines Fhrerscheins'))

WebUI.click(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank/a_Fahren ab 17'))

WebUI.delay(2)

WebUI.verifyElementInViewport(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank (1)/span_Die Fahrerlaubnis ab 17 J'), 
    0)

WebUI.click(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank/a_Checkliste Praktische Prfung'))

WebUI.delay(2)

WebUI.verifyElementInViewport(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank (1)/span_Checkliste Vorbereitung a'), 
    0)

WebUI.click(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank/a_Die theoretische Prfung'))

WebUI.delay(2)

WebUI.verifyElementInViewport(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank (1)/span_Die theoretische Fhrersch'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Fhrerschein machen - Volksbank/a_Seitenanfang'))

WebUI.delay(2)

WebUI.click(findTestObject('Sticky-Nav/Page_Volksbanken Raiffeisenbanken a/a_Junge Kunden'))

WebUI.click(findTestObject('Sticky-Nav/Page_Junge Kunden - Volksbanken Rai/img_1'))

WebUI.delay(15)

WebUI.click(findTestObject('Sticky-Nav/Page_Beruf finden - Volksbanken Rai/a_Studium oder Ausbildung'))

WebUI.click(findTestObject('Sticky-Nav/Page_Beruf finden - Volksbanken Rai/a_Finanzielle Untersttzung'))

WebUI.click(findTestObject('Sticky-Nav/Page_Beruf finden - Volksbanken Rai/a_Checkliste Bewerbung'))

WebUI.click(findTestObject('Sticky-Nav/Page_Beruf finden - Volksbanken Rai/a_Welcher Beruf passt zu mir'))

WebUI.closeBrowser()

