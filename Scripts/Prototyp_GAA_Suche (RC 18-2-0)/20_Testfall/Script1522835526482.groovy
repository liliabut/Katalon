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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/geldautomatensuche-bundesweit.html')

WebUI.delay(5)

WebUI.setText(findTestObject('13GAA/Page_Geldautomatensuche-bundesweit/input_city'), 'Berlin')

WebUI.click(findTestObject('13GAA/Page_Geldautomatensuche-bundesweit/button_Suchen'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/01ErgebnisText'), 'Geldautomat: Berliner Volksbank eG, FinanzCenter Friedrichshain')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/02ErgebnisText'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/03ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/04ErgebnisTest'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/05ErgebnisTest'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/06ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/07ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/08ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/09ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/10ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG, FinanzCenter Neukölln')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/11ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/12ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/13ErgebnisTest'), 'Geldautomat: BBBank eG, Filiale')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/14ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/15ErgebnisTest'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/16ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG, FilialCenter Prenzlauer Berg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/17ErgebnisTest'), 'Geldautomat: Pax-Bank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/18ErgebnisTest'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/19ErgebnisTest'), 'Geldautomat: GLS Gemeinschaftsbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/20ErgebnisTest'), 'Geldautomat: Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/21ErgebnisTest'), 'Geldautomat: Evangelische Bank eG - Filiale Berlin')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/22ErgebnisTest'), 'Geldautomat: BBBank eG, Filiale')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/23ErgebnisTest'), 'Geldautomat: Deutsche Apotheker- und Ärztebank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/24ErgebnisTest'), 'Geldautomat: BBBank eG, SB Filiale, nicht öffentlich zugänglich')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/25ErgebnisTest'), 'Geldautomat: Sparda-Bank Berlin eG')

WebUI.closeBrowser()

