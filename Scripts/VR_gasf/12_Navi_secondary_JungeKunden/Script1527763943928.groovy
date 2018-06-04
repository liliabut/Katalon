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

WebUI.navigateToUrl('https://gasfdbvr.vr.de/karriere.html')

WebUI.scrollToElement(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Schler'), 0)

WebUI.mouseOver(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Schler'))

WebUI.verifyTextPresent('next', false)

WebUI.verifyTextPresent('Schülerpraktikum', false)

WebUI.verifyTextPresent('FAQ Schüler', false)

WebUI.scrollToElement(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Studenten'), 0)

WebUI.mouseOver(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Studenten'))

WebUI.verifyTextPresent('Einstiegsmöglichkeiten', false)

WebUI.verifyTextPresent('Traineeprogramm', false)

WebUI.verifyTextPresent('FAQ Studenten', false)

WebUI.verifyTextPresent('Bewerbung', false)

WebUI.scrollToElement(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Berufserfahrene'), 0)

WebUI.mouseOver(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Berufserfahrene'))

WebUI.verifyTextPresent('Karrierechancen', false)

WebUI.verifyTextPresent('Weiterbildung', false)

WebUI.verifyTextPresent('Führungskräfteentwicklung', false)

WebUI.verifyTextPresent('FAQ Berufserfahrene', false)

WebUI.verifyTextPresent('Bewerbung', false)

WebUI.scrollToElement(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Stellenangebote finden'), 0)

WebUI.click(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Stellenangebote finden'))

WebUI.scrollToElement(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Was wir anders machen'), 0)

WebUI.mouseOver(findTestObject('13VR/Page_Karriere - Volksbanken Raiffei/a_Was wir anders machen'))

WebUI.verifyTextPresent('Wir als Arbeitgeber', false)

WebUI.verifyTextPresent('Unsere Auszeichnungen', false)

WebUI.verifyTextPresent('Arbeiten in der Genossenschaftlichen FinanzGruppe', false)

WebUI.verifyTextPresent('Idee der Genossenschaftsbanken', false)

WebUI.verifyTextPresent('Genossenschaftliche Werte', false)

WebUI.verifyTextPresent('Mitgliedschaft', false)

WebUI.verifyTextPresent('Genossenschaftliche Beratung', false)

WebUI.click(findTestObject('10VR/Page_Privatkunden - Volksbanken Rai (1)/a_Firmenkunden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Unternehmensziele', false)

WebUI.click(findTestObject('12VR/Page_Junge Kunden - Volksbanken Rai (1)/a_Privatkunden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bei welchen Zielen können wir Sie unterstützen?', false)

WebUI.click(findTestObject('10VR/Page_Firmenkunden - Volksbanken Rai/a_Junge Kunden'))

WebUI.delay(2)

WebUI.verifyTextPresent('Produkte für junge Kunden', false)

WebUI.closeBrowser()

