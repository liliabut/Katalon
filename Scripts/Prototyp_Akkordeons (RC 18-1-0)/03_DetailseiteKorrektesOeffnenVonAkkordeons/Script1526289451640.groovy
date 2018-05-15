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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/detail.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Akkordeon 01 geschlossen - schließen aller offenen Akkordeons, da offene Akkordeons die Xpath indezes durcheinander bringen\r\n'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 02 geschlossen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 03 geschlossen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 01 - ab hier Tests ob neu geöffnete Akkordeons andere Akkordeons korrekt schließen und scrollen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.waitForElementClickable(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01'), 0)

WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01'), 0)

'Öffnen Akkordeon 02'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon 2"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

WebUI.waitForElementClickable(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), 0)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), 0)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon3"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon3', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

'Schließen Akkordeon 3 - Wir shcließen das aktive Element da das nächste Akkordeon zu einer anderen Gruppe gehört'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 10'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon10'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon1"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Wir scrollen zum nächsten element (dessen index durch das aktive Element um eins reduziert wurde)'
WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon10'), 0)

'Öffnen Akkordeon 11'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon10'), FailureHandling.STOP_ON_FAILURE)

'Ist Text des aktiven Elements jetzt "Akkordeon2"\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Aktives Element im Viewport'
WebUI.verifyElementInViewport(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 0)

WebUI.closeBrowser()

