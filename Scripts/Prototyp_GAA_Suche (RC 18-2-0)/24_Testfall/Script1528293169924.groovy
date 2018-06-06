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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/geldautomatensuche-bonn.html')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/01ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - bei ALDI')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/02ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - SB Uni-Klinik')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/03ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Auerberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/04ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - im SUTI Center')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/05ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Walberberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/06ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Merten')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/07ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bornheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/08ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Waldorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/09ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Filiale Eitorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/10ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Hennef')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/11ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Uckerath')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/12ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Porz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/13ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Esch')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/14ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Dellbrück')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/15ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Lindenthal')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/16ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Mülheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/17ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Heimersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/18ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Widdersdorf')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/19ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Heumarkt')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/20ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Zollstock')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/21ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Filiale 11')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/22ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Merheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/23ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Ebertplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/24ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Brück')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/25ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bickendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/26ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Oberpleis')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/27ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Königswinter')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/28ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Dollendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/29ErgebnisTest'), 'Geldautomat: Volksbank Bonn Rhein-Sieg eG, Filiale Stieldorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/30ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Thomasberg')

WebUI.closeBrowser()

