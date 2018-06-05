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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/accordion-overview.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 01 geschlossen - schließen aller offenen Akkordeons, da offene Akkordeons die Xpath indezes durcheinander bringen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 04 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 15 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 23 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 25 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 31 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 33 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 36 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 42 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 15'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 22'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon22'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon2"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Schließen Akkordeon 22'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 31'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon31'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Das ist noch eine weitere Absatzheadline', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 32'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon32'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Finanzielle Spielräume schaffen', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Schließen Akkordeon 32'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 33'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon33'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Suchergebnis130', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 34'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon34'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Suchergebnis24', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 35'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon35'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Suchergebnis311', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Schließen Akkordeon 35'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 36'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon36'), FailureHandling.STOP_ON_FAILURE)

'"Suchergebnis in Accordion (2)": Inhalt von 1.Akk "Produkte (110)"'
WebUI.verifyTextPresent('Eniteo.de', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Produkte110', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon36'), 0)

'Öffnen Akkordeon 37'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon36'), FailureHandling.STOP_ON_FAILURE)

'"Suchergebnis in Accordion (2)": Inhalt von 2.Akk "Service und Beratung (17)"'
WebUI.verifyTextPresent('Jugend und Finanzen', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'ServiceundBeratung17', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 38'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon37'), FailureHandling.STOP_ON_FAILURE)

'"Suchergebnis in Accordion (2)": Inhalt von 3.Akk "Aktuelles und Regionales (27)"'
WebUI.verifyTextPresent('Taschendiebe', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'AktuellesundRegionales27', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 39'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon38'), FailureHandling.STOP_ON_FAILURE)

'"Suchergebnis in Accordion (2)": Inhalt von 4.Akk "Über Ihre Bank (8)"'
WebUI.verifyTextPresent('Übersicht Filialen', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'berIhreBank8', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Öffnen Akkordeon 40'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon39'), FailureHandling.STOP_ON_FAILURE)

'"Suchergebnis in Accordion (2)": Inhalt von 5.Akk "Weitere Treffer (21)"'
WebUI.verifyTextPresent('Ehrenamt und Engagement', false)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WeitereTreffer21', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Schließen Akkordeon 40'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 41'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon41'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'AkkordeonTeaser', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.closeBrowser()

