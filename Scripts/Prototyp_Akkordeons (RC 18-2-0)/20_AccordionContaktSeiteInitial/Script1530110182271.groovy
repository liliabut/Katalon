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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/accordion-contacts.html')

WebUI.waitForPageLoad(0)

WebUI.delay(6)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/ul_Anja KnigAnlageberaterinTel'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/ul_Jim GordonPrivatkunden-Bera'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_Weiter'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (3)/ul_Anja KnigAnlageberaterinTel'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (3)/ul_Jim GordonPrivatkunden-Bera'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_3'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_4'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_Zum Anfang'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_Paginierte Kontakte 2'))

WebUI.delay(3)

WebUI.verifyElementNotVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/ul_Anja KnigAnlageberaterinTel'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/ul_Jim GordonPrivatkunden-Bera'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_2 Kontakte'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_10 Kontakte'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/div_Renate Musterfrau 3Anlageb'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/div_Renate Musterfrau 4Anlageb'))

WebUI.delay(2)

WebUI.click(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML/a_20 Kontakte'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/div_Renate Musterfrau 11Anlage'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/div_Renate Musterfrau 19Anlage'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Akk_20/Page_Accordion-contacts - BVR HTML (2)/div_Renate Musterfrau 20Anlage'))

WebUI.delay(2)

WebUI.closeBrowser()

