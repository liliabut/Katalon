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


suiteProperties.put('id', 'Test Suites/GAA 18-2')

suiteProperties.put('name', 'GAA 18-2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\vr-test\\git\\Katalon\\Reports\\GAA 18-2\\20180329_123318\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GAA 18-2', suiteProperties, [new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/01_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/01_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/03_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/03_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/04_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/04_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/05_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/05_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/06_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/06_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/15_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/15_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/16_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/16_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/17_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/17_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/18_Testfall', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/18_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_GAA_Suche (RC18-2-0)/19TF', 'Test Cases/Prototyp_GAA_Suche (RC18-2-0)/19TF',  null)])
