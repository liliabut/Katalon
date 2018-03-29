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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/accordion-disabled.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 02 Offen - Ab hier testen wir ob sich die Akkordeons korrekt öffnen und scrollen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon02 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]',
		''), 'Akkordeon2', false)

WebUI.delay(5)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonDisabledXpath/Akkordeon02'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon02'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon3"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]',
		''), 'Akkordeon3', false)

WebUI.delay(5)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon04'), 0)

WebUI.delay(5)

'Akkordeon 05 offen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Korrektes Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon05Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon05'), 0)

WebUI.delay(5)

'Akkordeon 06 offen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon05'), FailureHandling.STOP_ON_FAILURE)

'Ist Korrektes Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon06Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon06'), 0)

WebUI.delay(5)

'Akkordeon 07 offen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon06'), FailureHandling.STOP_ON_FAILURE)

'Ist Korrektes Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon07Active'), 0)