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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-1/geldautomatensuche-bonn.html')

WebUI.delay(5)

WebUI.click(findTestObject('002/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Bornheim_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Bornheim_option'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/01ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - im SUTI Center')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/02ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - Walberberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/03ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Merten')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/04ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bornheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/05ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Waldorf')

WebUI.closeBrowser()

