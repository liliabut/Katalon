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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/geldautomatensuche.html')

WebUI.delay(5)

ArrayList<WebElement> wes = WebUiCommonHelper.findWebElements(findTestObject('loc_city_filialsuche'), 5)

ArrayList<WebElement> wes2 = WebUiCommonHelper.findWebElements(findTestObject('loc_steet_filialsuche'), 5)

for (int i = 1; i < wes.size(); i++) {
    el = wes.get(i)

    el_prev = wes.get(i - 1)

    String text = el.getAttribute('innerHTML')

    String text_prev = el_prev.getAttribute('innerHTML')

    text = text.replaceAll('ö', 'o')

    text = text.replaceAll('Ö', 'O')

    text_prev = text_prev.replaceAll('ö', 'o')

    text_prev = text_prev.replaceAll('Ö', 'O')

    text = text.replaceAll('ä', 'a')

    text = text.replaceAll('Ä', 'A')

    text_prev = text_prev.replaceAll('ä', 'a')

    text_prev = text_prev.replaceAll('Ä', 'A')

    text = text.replaceAll('ü', 'u')

    text = text.replaceAll('Ü', 'U')

    text_prev = text_prev.replaceAll('ü', 'u')

    text_prev = text_prev.replaceAll('Ü', 'U')

    text = (text.split(' ')[1])

    text_prev = (text_prev.split(' ')[1])

    char ch = text.charAt(0)

    char ch_prev = el_prev.getAttribute('innerHTML').charAt(0)

    if (ch_prev > ch) {
        WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)

        WebUI.closeBrowser()

        throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)
    } else if (ch_prev == ch) {
        ch = text.charAt(1)

        ch_prev = text_prev.charAt(1)

        if (ch_prev > ch) {
            WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)

            WebUI.closeBrowser()

            throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)
        } else if (ch_prev == ch) {
            ch = text.charAt(2)

            ch_prev = text_prev.charAt(2)

            if (ch_prev > ch) {
                WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)

                WebUI.closeBrowser()

                throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text) + ' und ') + text_prev)
            } else if (ch_prev == ch) {
                el2 = wes2.get(i)

                el_prev2 = wes2.get(i - 1)

                String text2 = el2.getAttribute('innerHTML')

                String text_prev2 = el_prev2.getAttribute('innerHTML')

                text2 = text2.replaceAll('ö', 'o')

                text2 = text2.replaceAll('Ö', 'O')

                text_prev2 = text_prev2.replaceAll('ö', 'o')

                text_prev2 = text_prev2.replaceAll('Ö', 'O')

                text2 = text2.replaceAll('ä', 'a')

                text2 = text2.replaceAll('Ä', 'A')

                text_prev2 = text_prev2.replaceAll('ä', 'a')

                text_prev2 = text_prev2.replaceAll('Ä', 'A')

                text2 = text2.replaceAll('ü', 'u')

                text2 = text2.replaceAll('Ü', 'U')

                text_prev2 = text_prev2.replaceAll('ü', 'u')

                text_prev2 = text_prev2.replaceAll('Ü', 'U')

                ch2 = text2.charAt(0)

                ch_prev2 = text_prev2.charAt(0)

                if (ch_prev2 > ch2) {
                    WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + text_prev2)

                    WebUI.closeBrowser()

                    throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + text_prev2)
                } else if (ch_prev2 == ch2) {
                    ch2 = text2.charAt(1)

                    ch_prev2 = text_prev2.charAt(1)

                    if (ch_prev2 > ch2) {
                        WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + text_prev2)

                        WebUI.closeBrowser()

                        throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + text_prev2)
                    } else if (ch_prev2 == ch2) {
                        ch2 = text2.charAt(2)

                        ch_prev2 = text_prev2.charAt(2)

                        if (ch_prev2 > ch2) {
                            WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + text_prev2)

                            WebUI.closeBrowser()

                            throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + text2) + ' und ') + 
                            text_prev2)
                        }
                    }
                }
            }
        }
    }
}

WebUI.closeBrowser()

