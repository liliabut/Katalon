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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/faq.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Öffnen Akkordeon 01 - Ab hier Test ob sich alle FAQ Akkordeons (die nicht in einem anderen Akk. sind gleichzeitig öffnen lassen\r\n'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes.', 
    false)

'Ist Akkordeon01 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon01Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 02'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.', false)

'Ist Akkordeon02 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon02Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Öffnen Akkordeon 03'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind Sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes.', 
    false)

'Ist Akkordeon03 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon03Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WieveleZinsengibtes', false)

'Öffnen Akkordeon 04'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum.', 
    false)

'Ist Akkordeon04 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon0Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 05'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh.', 
    false)

'Ist Akkordeon05 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon05Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 06'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.', 
    false)

'Ist Akkordeon06 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon06Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

'Öffnen Akkordeon 08'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes.', 
    false)

'Ist Akkordeon08 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon08Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WerbrauchtdieseVersicherung', false)

'Öffnen Akkordeon 09'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.', false)

'Ist Akkordeon09 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon09Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WannspringtdieVersicherungein', false)

'Öffnen Akkordeon10'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind Sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes.', 
    false)

'Ist Akkordeon10 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon10Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WieveleZinsengibtes', false)

'Öffnen Akkordeon 11'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Mit unserem kostenlosen Tagesgeldkonto sind sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum.', 
    false)

'Ist Akkordeon11 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon11Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WiesiehteinBeispielausmitBildundLinkliste', false)

'Öffnen Akkordeon 12'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh.', 
    false)

'Ist Akkordeon12 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon12Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'WarumbrauchtmandieVersicherung', false)

'Öffnen Akkordeon 13'
WebUI.click(findTestObject('AkkordeonFAQXpath/Akkordeon01'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.', 
    false)

'Ist Akkordeon13 offen\r\n'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('AkkordeonFAQXpath/Akkordeon13Active'), 'text').replaceAll('[^a-zA-Z0-9]', 
        ''), 'LoremipsumdolorsitametconsetetursadipscingelitrseddiamnonumyeirmodtemporinviduntutlaboreetdoloremagnaaliquyameratseddiamvoluptuaAtveroeosetaccusametjustoduodoloresetearebumAtveroeosetaccusametjustoduodoloresetearebumStetclitakasdgubergrennoseatakimatasanctusest', 
    false)

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wer braucht diese Versicheru'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wann springt die Versicherun'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wievele Zinsen gibt es'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wie sieht ein Beispiel aus m'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Warum braucht man die Versic'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Lorem ipsum dolor sit amet c'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wer braucht diese Versicheru_1'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wann springt die Versicherun_1'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wievele Zinsen gibt es_1'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Wie sieht ein Beispiel aus m_1'))

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Lorem ipsum dolor sit amet c_1'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akk08/Page_Faq - BVR HTML Prototyp/a_Warum braucht man die Versic_1'))

WebUI.verifyTextNotPresent('Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes.', 
    false)

WebUI.verifyTextNotPresent('Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.', false)

WebUI.verifyTextNotPresent('Mit unserem kostenlosen Tagesgeldkonto sind Sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes.', 
    false)

WebUI.verifyTextNotPresent('Mit unserem kostenlosen Tagesgeldkonto sind sie immer auf der sicheren Seite und verfügen rund um die Uhr unabhängig über Ihr Erspartes. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum. Lorem ipsum dolo ret samet Massa Maretima consequentum.', 
    false)

WebUI.verifyTextNotPresent('Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh.', 
    false)

WebUI.verifyTextNotPresent('Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.', 
    false)

WebUI.closeBrowser()

