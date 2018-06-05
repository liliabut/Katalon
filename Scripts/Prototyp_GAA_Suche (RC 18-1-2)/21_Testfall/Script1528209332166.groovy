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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/geldautomatensuche.html')

WebUI.delay(5)

WebUI.click(findTestObject('002/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Berlin_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Berlin_option'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/01ErgebnisText'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/02ErgebnisText'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/03ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/04ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/05ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/06ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/07ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/08ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/09ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/10ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/11ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/12ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/13ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/14ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/15ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/16ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/17ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/18ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/19ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/20ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/21ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/22ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/23ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/24ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/25ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/26ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/27ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/28ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/29ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/30ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/31ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/32ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/33ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/34ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/35ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/36ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/37ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/38ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/39ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/40ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/41ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/42ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/43ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/44ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/45ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/46ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/47ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/48ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/49ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/50ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/51ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/52ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/53ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/54ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/55ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/56ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/57ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/58ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/59ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/60ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('GAA21/Page_Geldautomatensuche - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/61ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/62ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/63ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/64ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/65ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/66ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.closeBrowser()

WebUI.closeBrowser()

