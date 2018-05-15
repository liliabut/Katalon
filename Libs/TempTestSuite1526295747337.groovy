import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GAA')

suiteProperties.put('name', 'GAA')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\vr-test\\git\\Katalon\\Reports\\GAA\\20180514_130227\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GAA', suiteProperties, [new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/01_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/01_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/02_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/02_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/03_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/03_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/04_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/04_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/05_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/05_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/06_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/06_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/07_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/07_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/08_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/08_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/09_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/09_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/10_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/10_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/11_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/11_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/12_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/12_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/13_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/13_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/14_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/14_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/15_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/15_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/16_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/16_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/17_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/17_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/18_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/18_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/19_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/19_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/20_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/20_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/21_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-2-0)/21_Testfall',  null)])
