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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/accordion-overview.html')

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

'Öffnen Akkordeon 15 - Wir öffnen das Äußere Akkordeon das andere beinhaltet'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon15 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'Akkordeon1', false)

'Öffnen Akkordeon 16 - Wir öffnen das erste innere FAQ Akkordeon'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes.', 
    false)

'Ist Akkordeon16 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 17'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.', false)

'Ist Akkordeon17 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon03Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 18'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind Sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes.', 
    false)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon18 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon04Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 19'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum.', 
    false)

'Ist Akkordeon19 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon05Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 20'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh.', 
    false)

'Ist Akkordeon20 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 21'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.', 
    false)

'Ist Akkordeon21 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon07Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

'Schließen Akkordeon 15 - Wir schließen das Äußere Akkordeon um zu testen ob die Inneren beim schließen und wieder öffnen des Äußeren offen bleiben'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 15'
WebUI.click(findTestObject('AkkordeonOverviewXpath/Akkordeon15 - Aeusseres'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon16 offen - Wirt esten ob die inneren FAQ Akkordeons weiterhin geöffnet sind\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon02Active'), 'aria-expanded'), 'true', 
    false)

'Ist Akkordeon17 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon03Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Ist Akkordeon18 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon04Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Ist Akkordeon19 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon05Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Ist Akkordeon20 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Ist Akkordeon21 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonOverviewXpath/Akkordeon07Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

WebUI.closeBrowser()

