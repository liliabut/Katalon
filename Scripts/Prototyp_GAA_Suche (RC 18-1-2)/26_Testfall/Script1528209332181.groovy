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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/geldautomatensuche-goeppingen.html')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/01ErgebnisText'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/02ErgebnisText'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/03ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/04ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/05ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/06ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/07ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/08ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/09ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/10ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/11ErgebnisTest'), 'Geldautomat: Volklsbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/12ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/13ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/14ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/15ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/16ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/17ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/18ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/19ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/20ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/21ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/22ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/23ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/24ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/25ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/26ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/27ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/28ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/29ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/30ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/31ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/32ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/33ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/34ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/35ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/36ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/37ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/38ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/39ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/40ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/41ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/42ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/43ErgebnisTest'), 'Geldautomat: Volksbank Göppingen eG')

WebUI.closeBrowser()

