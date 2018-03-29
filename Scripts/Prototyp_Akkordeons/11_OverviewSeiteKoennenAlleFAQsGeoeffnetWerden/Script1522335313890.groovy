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

'Öffnen Akkordeon 09 - Ab hier Test ob sich alle FAQ Akkordeons gleichzeitig öffnen lassen\r\n'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon09 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 10'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon10 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon10 -FAQ2 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'WannspringtdieVersicherungein', false)

'Öffnen Akkordeon 11'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon11 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon11 -FAQ3 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'WieveleZinsengibtes', false)

'Öffnen Akkordeon 12'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon12 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon12 -FAQ4 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 13'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon13 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon13 -FAQ5 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 14'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon09 -FAQ1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon14 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon14 -FAQ6 - Active'), 'text').replaceAll(
        '[^a-zA-Z0-9]', ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

WebUI.closeBrowser()

