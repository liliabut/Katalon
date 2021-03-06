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

'Öffnen Akkordeon 08  - Wir öffnen das Äußere Akkordeon das andere beinhaltet'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes.', 
    false)

'Ist Akkordeon08 jetzt offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon02Active'), 'aria-expanded'), 'true', false)

'Öffnen Akkordeon 09'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.', false)

'Ist Akkordeon09 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon03Active'), 'aria-expanded'), 'true', false)

'Öffnen Akkordeon10'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind Sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes.', 
    false)

'Ist Akkordeon10 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon0Active'), 'aria-expanded'), 'true', false)

'Öffnen Akkordeon 11'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum.', 
    false)

'Ist Akkordeon11 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon05Active'), 'aria-expanded'), 'true', false)

'Öffnen Akkordeon 12'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh.', 
    false)

'Ist Akkordeon12 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 13'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon07'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.', 
    false)

'Ist Akkordeon13 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon07Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

'Schließen Akkordeon 07 - Wir schließen das Äußere Akkordeon um zu testen ob die inneren Akkordeons beims chließen und wieder öffnen des Äußeren weitehring geööfnet bleiben'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01Active'), FailureHandling.STOP_ON_FAILURE)

'Öffnen Akkordeon 07'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

'Ist Akkordeon08 offen - Wir testen ab hier ob die inneren FAQ Akkordeons weiterhin geöffnet sind\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Ist Akkordeon09 offen'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon03Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Ist Akkordeon10 offen'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon0Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WieveleZinsengibtes', false)

'Ist Akkordeon11 offen'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon05Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Ist Akkordeon12 offen'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Ist Akkordeon13 offen'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon07Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

WebUI.closeBrowser()

