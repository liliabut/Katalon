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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/faq.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Öffnen Akkordeon 01 - Ab hier Test ob sich alle FAQ Akkordeons (die nicht in einem anderen Akk. sind gleichzeitig öffnen lassen\r\n'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon01 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 02'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon02 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon03 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon03Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WieveleZinsengibtes', false)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon04 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon0Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 05'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon05 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon05Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 06'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon06 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

'Öffnen Akkordeon 08'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon08 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon08Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 09'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon09 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon09Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Öffnen Akkordeon10'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon10 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon10Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WieveleZinsengibtes', false)

'Öffnen Akkordeon 11'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon11 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon11Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 12'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon12 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon12Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 13'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon13 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon13Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

WebUI.closeBrowser()

