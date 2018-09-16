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

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/01ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - Aegidienberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/02ErgebnisText'), 'Geldautomat: Volksbank Köln Bonn eG - Bad Honnef')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/03ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bad Honnef-Selhof')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/04ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Rottbitze')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/05ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Endenich')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/06ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Duisdorf')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/07ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - OBI / Bornheimer Str.')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/08ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - ALDI / Endenicher Str.')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/09ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Beuel-Zentrum')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/10ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Gangolfstraße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/11ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Volksbank-Haus')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/12ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Holzlar')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/13ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Oberkassel')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/14ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Auerberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/15ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Küdinghoven')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/16ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Pützchen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/17ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bad Godesberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/18ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Oxfordstr.')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/19ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Kessenich')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/20ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - ALDI / Röttgen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/21ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Uni-Klinik')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/22ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Walberberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/23ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Merten')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/24ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bornheim')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/25ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Hersel')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/26ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Waldorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/27ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Geldautomat im SUTI Center')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/28ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Roisdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/29ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bornheim-Sechtem')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/30ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Buchholz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/31ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Filiale Eitorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/32ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - REWE-Markt / Hennef')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/33ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Hennef')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/34ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Uckerath')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/35ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Braunsfeld')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/36ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - SVG Autohof Eifeltor')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/37ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Geldautomat im Brauhaus Früh')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/38ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Geldautomat im Cinedom')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/39ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Porz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/40ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - REWE Bayenthal')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/41ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Filiale 11')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/42ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - DuMont-Carré')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/43ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Esch')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/44ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Dellbrück')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/45ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Lindenthal')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/46ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Frankenwerft')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/47ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Mülheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/48ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - REWE Niehl')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/49ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Ensen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/50ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Görlinger Zentrum')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/51ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Heimersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/52ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Widdersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/53ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Heumarkt')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/54ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Zülpicher Platz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/55ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Hauptsstelle Köln')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/56ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Zollstock')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/57ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Chlodwigplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/58ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Kaiser-Wilhelm-Ring')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/59ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Kalk')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/60ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Merheim')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/61ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Junkersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/62ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Westfalen Tankstelle Kölner Str.')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/63ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Krebsgasse')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/64ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bocklemünd')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/65ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Rodenkirchen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/66ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Shell Deutz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/67ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Nippes')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/68ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Ebertplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/69ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Brück')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/70ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - HIT-Markt')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/71ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Rondorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/72ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Rath/Heumar')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/73ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - EDEKA / Köln-Wahn')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/74ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Poll')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/75ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Riehl')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/76ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Sülz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/77ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Westfalen Tankstelle Venloer Str.')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/78ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Ehrenfeld')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/79ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Bickendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/80ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Zülpicher Str.')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/81ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Oberpleis')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/82ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Königswinter')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/83ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Dollendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/84ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Stieldorf')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/85ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Thomasberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/86ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - HUMA Shoppingwelt')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/87ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Siegburg-Kaldauen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Footer/88ErgebnisTest'), 'Geldautomat: Volksbank Köln Bonn eG - Windeck-Leuscheid')

WebUI.closeBrowser()

