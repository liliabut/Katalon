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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-1/filialsuche-rotenburg.html')

WebUI.waitForPageLoad(0)

WebUI.delay(4)

WebUI.click(findTestObject('03/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('002/Page_Filialsuche-rotenburg - BVR HT/div_Bad Hersfeld'))

WebUI.delay(2)

WebUI.click(findTestObject('03/Page_Filialsuche-rotenburg - BVR HT/div_Bad Hersfeld'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/01ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Bad Hersfeld')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/02ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/03ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG SB-Stelle Bad Hersfeld')

WebUI.delay(2)

WebUI.click(findTestObject('03/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('62TF/Page_Filialsuche-rotenburg - BVR HT (2)/div_Bebra'))

WebUI.delay(2)

WebUI.click(findTestObject('62TF/Page_Filialsuche-rotenburg - BVR HT (2)/div_Bebra'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/01ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Bebra Amalienstraße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/02ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG SB-Stelle Bebra')

WebUI.closeBrowser()

