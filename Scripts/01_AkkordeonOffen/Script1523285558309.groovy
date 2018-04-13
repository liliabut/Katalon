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
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-2-0/accordion-overview.html')

WebUI.delay(5)

ArrayList<WebElement> wes = WebUiCommonHelper.findWebElements(findTestObject('Akkordeon_Group'), 5)

for (int i = 1; i <= wes.size; i++) {
    el = wes.get(i)

    ArrayList<WebElement> all_accordeons = el.findElements(new ByXPath('(//div[contains(@id, \'accordion\')])[' + i + ']//a[contains(@class, \'acc-header\')]'))

    ArrayList<WebElement> open_accordeons = el.findElements(new ByXPath('(//div[contains(@id, \'accordion\')])[' + i +']//a[@class=\'acc-header active\']'))

    if (open_accordeons.size > 1) {
        WebUI.comment('Mehr alz 1 Akkordion sind offen!')

        WebUI.closeBrowser()

        throw new StepFailedException('Mehr alz 1 Akkordion sind offen!')
    } else if (open_accordeons.size == 0) {
        WebUI.comment('Kein Akkordion ist offen!')

        WebUI.closeBrowser()

        throw new StepFailedException('Kein Akkordion ist offen!')
    } else {
        String class_name = all_accordeons.get(0).getAttribute('class')

        if (!(class_name.endsWith('active'))) {
            WebUI.comment('Erster Akkordeon ist zu!')

            WebUI.closeBrowser()

            throw new StepFailedException('Erster Akkordeon ist zu!')
        }
    }
}

WebUI.closeBrowser()