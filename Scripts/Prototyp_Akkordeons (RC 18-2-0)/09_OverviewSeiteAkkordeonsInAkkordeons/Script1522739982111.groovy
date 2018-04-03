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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/accordion-overview.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 01 geschlossen - schließen aller Akkordeons, da offene Akkordeons die Xpath indezes durcheinander bringen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 04 geschlossen\r\n'
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

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), 0)

'Öffnen Akkordeon 25 - Wir öffnen das Äußere Akkordeon das andere beinhaltet'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon25 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon25 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 26 - Wir öffnen das erste innere Akkordeon'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon26 - Inneres 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Das ist noch eine weitere Absatzheadline', false)

'Ist Akkordeon26 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Schließen Akkordeon 25 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 25'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon25 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon26 offen - Wirt esten ob das innere Akkordeon weiterhin geöffnet ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 27 - Wir öffnen das zweite innere Akkordeon'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon27 - Inneres2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Finanzielle Spielräume schaffen', false)

'Schließen Akkordeon 25 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 25'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon25 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon27 offen - Wirt esten ob das innere Akkordeon weiterhin geöffnet ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

'Schließen Akkordeon 27 - Wir schließen die offenen Akkordeons damit die indezes wieder stimmen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), FailureHandling.STOP_ON_FAILURE)

'Schließen Akkordeon 25'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 28 - Zweite Akkordeon Gruppe'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon28 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 29 - Wir öffnen das erste innere Akkordeon der wziten Gruppe'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon29 - Inneres1'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon29 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Schließen Akkordeon 28 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 28'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon28 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon29 offen - Wirt esten ob das innere Akkordeon weiterhin geöffnet ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 30 - Wir öffnen das zweite innere Akkordeon'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon30 - Inneres2'), FailureHandling.STOP_ON_FAILURE)

'Schließen Akkordeon 28 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 28'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon28 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon30 offen - Wirt esten ob das innere Akkordeon weiterhin geöffnet ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.closeBrowser()

