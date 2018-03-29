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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/suchergebnis-2.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Öffnen Akkordeon 02 - ab hier tests ob neu geöffnete Akkordeons andere akkordeons korrekt schließen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Servic eund Beratung 17"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'ServiceundBeratung17', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon3"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'AktuellesundRegionales27', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon03'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon03'), 0)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon03'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Über Ihre Bank 8"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'berIhreBank8', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), 0)

'Öffnen Akkordeon 05'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Weitere Treffer 21"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WeitereTreffer21', false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

WebUI.closeBrowser()

