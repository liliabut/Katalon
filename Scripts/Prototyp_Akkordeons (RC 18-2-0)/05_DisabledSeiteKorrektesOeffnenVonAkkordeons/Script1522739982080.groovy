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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/accordion-disabled.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 02 Offen - Ab hier testen wir ob sich die Akkordeons korrekt öffnen und scrollen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon02 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(1)

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

WebUI.delay(2)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon01Active'), 0)

WebUI.click(findTestObject('05Akk/Page_Accordion-disabled - BVR HTML/a_Akkordeon 3'))

WebUI.delay(2)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon04'), 0)

WebUI.delay(2)

'Akkordeon 05 offen'
WebUI.click(findTestObject('AkkordeonDisabledXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon05'), 0)

WebUI.delay(2)

WebUI.delay(2)

'Ist Korrektes Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDisabledXpath/Akkordeon06Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDisabledXpath/Akkordeon06'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

