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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/accordion-overview.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 01 geschlossen - schließen aller offenen Akkordeons, da offene Akkordeons die Xpath indezes durcheinander bringen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 04 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 15 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 23 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 25 geschlossen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 31 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 33 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 36 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Akkordeon 42 geschlossen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 01 - ab hier tests ob neu geöffnete Akkordeons andere akkordeons korrekt schließen'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 02'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon 2"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon02'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon3"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon3', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

'Wir schließen das aktive Element damit die Indizes der nächsten Gruppe stimmen)'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), 0)

'Wir scrollen zum nächsten element (das in der nächsten Gruppe liegt)'
WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), 0)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des zweiten aktiven Elements jetzt "2 Kontakte"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), '2Kontakte', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), 0)

'Öffnen Akkordeon 05'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des zweiten aktiven Elements jetzt "10 Kontakte"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), '10Kontakte', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon05'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon05'), 0)

'Öffnen Akkordeon 06'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon05'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des zweiten aktiven Elements jetzt "20 Kontakte"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), '20Kontakte', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon06'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon06'), 0)

'Öffnen Akkordeon 07'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon06'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des zweiten aktiven Elements jetzt "50 Kontakte"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), '50Kontakte', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)

WebUI.waitForElementClickable(findTestObject('AkkordeonOverviewXpath/Akkordeon07'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonOverviewXpath/Akkordeon07'), 0)

'Öffnen Akkordeon 08'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des zweiten aktiven Elements jetzt "100 Kontakte"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), '100Kontakte', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 0)
