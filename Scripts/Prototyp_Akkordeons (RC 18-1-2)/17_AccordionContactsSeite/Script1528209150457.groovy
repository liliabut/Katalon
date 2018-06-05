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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-2/accordion-contacts.html')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_10 Kontakte'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_10 Kontakte'))

WebUI.delay(1)

WebUI.verifyTextPresent('Renate Musterfrau 10', false)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_20 Kontakte'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_20 Kontakte'))

WebUI.delay(1)

WebUI.verifyTextPresent('Renate Musterfrau 20', false)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_50 Kontakte'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_50 Kontakte'))

WebUI.delay(3)

WebUI.verifyTextPresent('Renate Musterfrau 50', false)

WebUI.delay(1)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_100 Kontakte'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_100 Kontakte'))

WebUI.delay(3)

WebUI.verifyTextPresent('Renate Musterfrau 100', false)

WebUI.delay(2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_2 Kontakte'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Akk_17_TF/Page_Accordion-contacts - BVR HTML/a_2 Kontakte'))

WebUI.closeBrowser()

