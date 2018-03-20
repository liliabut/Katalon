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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/detail.html')

WebUI.delay(5)

WebUI.click(findTestObject('OGRPrototypFilialsuche - Marginalspalte/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Belitz_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Belitz_option'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/01ErgebnisText'), 'Berliner Volksbank eG, Filiale Moabit')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/02ErgebnisText'), 'Berliner Volksbank eG, Filiale Rudow')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/03ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Köpenick')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/04ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Lichtenrade')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/05ErgebnisTest'), 'Berliner Volksbank eG, Filiale Treptow')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/06ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Weißensee')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/07ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Tegel')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/08ErgebnisTest'), 'Berliner Volksbank eG, Filiale Prenzlauer Berg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/09ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Wilmersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/10ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Kaulsdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/11ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichshain')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/12ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichstraße')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/13ErgebnisTest'), 'Berliner Volksbank eG, Filiale Karl-Marx-Straße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/14ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wannsee')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/15ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Neukölln')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/16ErgebnisTest'), 'Berliner Volksbank eG, Filiale Lichterfelde-Ost')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/17ErgebnisTest'), 'Berliner Volksbank eG, Filiale Halensee')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/18ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Kurfürstendamm')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/19ErgebnisTest'), 'Berliner Volksbank eG, Filiale Frohnau')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/20ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Mariendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/21ErgebnisTest'), 'Berliner Volksbank eG, Filiale Ahrensfelde')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/22ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Spandau')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/23ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kreuzberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/24ErgebnisTest'), 'Berliner Volksbank eG, Filiale Leopoldplatz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/25ErgebnisTest'), 'Berliner Volksbank eG, Filiale Allende-Viertel')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/26ErgebnisTest'), 'Berliner Volksbank eG, Filiale Westend')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/27ErgebnisTest'), 'Berliner Volksbank eG, Filiale Adlershof')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/28ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kladow')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/29ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kurt-Schumacher-Platz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/30ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Steglitz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/31ErgebnisTest'), 'Berliner Volksbank eG, Filiale Helle Mitte')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/32ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Zehlendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/33ErgebnisTest'), 'Berliner Volksbank eG, Filiale Tempelhof')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/34ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Charlottenburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/35ErgebnisTest'), 'Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/36ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Pankow')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Marginalspalte/37ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wittenbergplatz')

WebUI.closeBrowser()

