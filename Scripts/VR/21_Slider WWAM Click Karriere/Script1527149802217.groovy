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

WebUI.navigateToUrl('https://www.vr.de/karriere.html')

WebUI.scrollToElement(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Als attraktive Arbeitgeber b'))

WebUI.delay(1)

WebUI.verifyTextPresent('Volksbanken Raiffeisenbanken als Arbeitgeber', false)

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Volksbanken Raiffeisenbanken a/a_Karriere'))

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Die Genossenschaftsbanken in'))

WebUI.delay(1)

WebUI.verifyTextPresent('Filialsuche', false)

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Filialsuche Karriere - Volksba/a_Karriere'))

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'))

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Zurck'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('21VR/Page_Karriere - Volksbanken Raiffei/a_Was einer alleine nicht scha'))

WebUI.delay(1)

WebUI.verifyTextPresent('Die Idee der Genossenschaftsbanken', false)

WebUI.delay(1)

WebUI.closeBrowser()

