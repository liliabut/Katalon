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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.junit.After as After
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/filialsuche-nuernberg.html')

//WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/filialsuche.html')
WebUI.delay(5)

ArrayList<WebElement> wes = WebUiCommonHelper.findWebElements(findTestObject('filial_map'), 5)

for (int i = 0; i < wes.size(); i++) {
    WebElement el = wes.get(i)

    text = el.getCssValue('background-image')

    if (!(text.contains('psd_bank.png'))) {
        WebUI.comment('Das Logo ist NICHT von der PSD-Bank!')

        WebUI.closeBrowser()

        throw new StepFailedException('Das Logo ist NICHT von der PSD-Bank!')
    }
}

WebUI.closeBrowser()

