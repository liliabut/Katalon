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


suiteProperties.put('id', 'Test Suites/GAA 18-1-2')

suiteProperties.put('name', 'GAA 18-1-2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\vr-test\\git\\Katalon2\\Reports\\GAA 18-1-2\\20180618_090417\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GAA 18-1-2', suiteProperties, [new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/01_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/01_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/02_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/02_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/03_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/03_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/04_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/04_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/05_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/05_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/06_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/06_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/07_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/07_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/08_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/08_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/09_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/09_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/10_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/10_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/11_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/11_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/12_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/12_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/13_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/13_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/14_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/14_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/15_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/15_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/16_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/16_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/17_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/17_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/18_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/18_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/19_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/19_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/20_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/20_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/21_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/21_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/22_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/22_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/23_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/23_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/24_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/24_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/25_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/25_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/26_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/26_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/27_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/27_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/28_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/28_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/29_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/29_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/33_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/33_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/34_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/34_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/35_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/35_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/36_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC 18-1-2)/36_Testfall',  null)])
