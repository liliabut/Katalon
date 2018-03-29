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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/detail.html')

WebUI.waitForPageLoad(0)

'Akkordeon 01 geschlossen - schließen aller offenen Akkordeons, da offene Akkordeons die Xpath indezes durcheinander bringen\r\n'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 02 geschlossen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Akkordeon 03 geschlossen'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), 0)

'Öffnen Akkordeon 04 - Wir öffnen das Äußere Akkordeon das andere beinhaltet'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon04 jetzt offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 05 - Wir öffnen das erste innere Akkordeon (Index ist 4 da ein anderes Akkordeon bereits offen ist)'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon05 jetzt offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Schließen Akkordeon 04 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon05 offen - Wir testen ob das innere Akkordeon weiterhin geöffnet ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 06 - Wir öffnen das zweite innere Akkordeon (Index ist weiterhin 4, das momentan 2 Andere Akk. offen sind)'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon06 jetzt offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Schließen Akkordeon 04 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon04'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon06 offen - Wir testen ob das innere Akkordeons weiterhin offen ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

'Wir schließen das innere Akkordeon 06'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), FailureHandling.STOP_ON_FAILURE)

'Wir schließen das äußere Akkordeon 04 um ab jetzt die nromalen Indizes benutzen zu können'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 07 - Wir öffnen das Äußere Akkordeon das andere beinhaltet'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon07 jetzt offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

'Öffnen Akkordeon 08- Wir öffnen das erste innere Akkordeon (Index ist 7 da ein anderes Akkordeon bereits offen ist)'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon08 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Schließen Akkordeon 07 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 07'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon08 offen - Wirt esten ob das innere Akkordeon weiterhin offen ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 09 - Wir öffnen das zweite innere Akkordeon (Index ist weiterhin 7, das momentan 2 Andere Akk. offen sind)'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon09 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Schließen Akkordeon 07 - Wir schließen das Äußere Akkordeon um zu testen ob das innere beim schließen und wieder öffnen des Äußeren offen bleibt'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 07'
WebUI.click(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon09 offen - Wirt esten ob das innere Akkordeon weiterhin offen ist\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonDetailSeiteXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon2', false)

WebUI.closeBrowser()

