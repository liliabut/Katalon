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

WebUI.scrollToElement(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Ihre Ziele'), 0)

WebUI.mouseOver(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Ihre Ziele'))

WebUI.verifyTextPresent('Auto kaufen', false)

WebUI.verifyTextPresent('Familie gründen', false)

WebUI.verifyTextPresent('Erbschaft verwalten', false)

WebUI.scrollToElement(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Unsere Produkte'), 0)

WebUI.mouseOver(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Unsere Produkte'))

WebUI.verifyTextPresent('Depot & Brokerage', false)

WebUI.verifyTextPresent('Girokonto', false)

WebUI.verifyTextPresent('Versicherung', false)

WebUI.verifyTextPresent('Baufinanzierung', false)

WebUI.scrollToElement(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Was wir anders machen'), 0)

WebUI.mouseOver(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai (1)/a_Was wir anders machen'))

WebUI.verifyTextPresent('Genossenschaftliche FinanzGruppe', false)

WebUI.verifyTextPresent('Genossenschaftliche Beratung', false)

WebUI.verifyTextPresent('Idee der Genossenschaftsbanken', false)

WebUI.verifyTextPresent('Genossenschaftliche Werte', false)

WebUI.verifyTextPresent('Wofür wir uns engagieren', false)

WebUI.verifyTextPresent('Einlagensicherung', false)

WebUI.scrollToElement(findTestObject('10VR/Page_Privatkunden - Volksbanken Rai/a_Kontakt  Filialen'), 0)

WebUI.mouseOver(findTestObject('10VR/Page_Privatkunden - Volksbanken Rai/a_Kontakt  Filialen'))

WebUI.verifyTextPresent('Sie suchen Öffnungszeiten, Konditionen,', false)

WebUI.click(findTestObject('03_VR_Navi/Page_Privatkunden - Volksbanken Rai/a_Mitgliedschaft'))

WebUI.delay(2)

WebUI.verifyTextPresent('Mitgliedschaft – mehr als nur Kunde sein', false)

WebUI.click(findTestObject('10VR/Page_Privatkunden - Volksbanken Rai (1)/a_Firmenkunden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Unternehmensziele', false)

WebUI.click(findTestObject('10VR/Page_Firmenkunden - Volksbanken Rai/a_Junge Kunden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Produkte für junge Kunden', false)

WebUI.click(findTestObject('10VR/Page_Junge Kunden - Volksbanken Rai/a_Karriere'))

WebUI.delay(2)

WebUI.verifyTextPresent('Stellenangebote finden', false)

WebUI.closeBrowser()

