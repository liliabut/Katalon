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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/faq.html')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

'Ist FAQ Akkordeon01 geschlossen - Wir testen ab hier ob zu Anfang alle FAQ Akk. geschlossen sind'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon01'), 0)

'Ist FAQ Akkordeon02 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon02'), 0)

'Ist FAQ Akkordeon03 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon03'), 0)

'Ist FAQ Akkordeon04 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon04'), 0)

'Ist FAQ Akkordeon05 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon05'), 0)

'Ist FAQ Akkordeon06 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon06'), 0)

'Ist FAQ Akkordeon08 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon08'), 0)

'Ist FAQ Akkordeon09 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon09'), 0)

'Ist FAQ Akkordeon10 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon10'), 0)

'Ist FAQ Akkordeon11 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon11'), 0)

'Ist FAQ Akkordeon12 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon12'), 0)

'Ist FAQ Akkordeon13 geschlossen'
WebUI.verifyElementPresent(findTestObject('AkkordeonFAQXpath/Akkordeon13'), 0)

