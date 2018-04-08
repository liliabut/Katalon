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


suiteProperties.put('id', 'Test Suites/Filialsuche')

suiteProperties.put('name', 'Filialsuche')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\vr-test\\git\\Katalon\\Reports\\Filialsuche\\20180406_132101\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Filialsuche', suiteProperties, [new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/01_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/01_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/02_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/02_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/03_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/03_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/04_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/04_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/05_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/05_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/06_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/06_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/07_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/07_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/08_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/08_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/09_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/09_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/10_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/10_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/11_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/11_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/12_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/12_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/13_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/13_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/14_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/14_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/15_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/15_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/16_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/16_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/17_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/17_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/18_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/18_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/19_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/19_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/20_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/20_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/21_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/21_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/22_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/22_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/23_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/23_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/24_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/24_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/25_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/25_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/26_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/26_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/27_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/27_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/28_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/28_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/29_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/29_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/30_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/30_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/31_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/31_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/32_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/32_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/33_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/33_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/34_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/34_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/35_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/35_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/36_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/36_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/37_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/37_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/38_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/38_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/39_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/39_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/40_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/40_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/41_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/41_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/42_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/42_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/43_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/43_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/44-Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/44-Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/45_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/45_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/46_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/46_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/47_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/47_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/48_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/48_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/49_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/49_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/50_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/50_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/51_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/51_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/52_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/52_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/53_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/53_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/54_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/54_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/55_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/55_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/56_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/56_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/57_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/57_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/58_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/58_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/59_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/59_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/60_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/60_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/61_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/61_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/62_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/62_Testfall',  null), new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18-2-0)/63_Testfall', 'Test Cases/Prototyp_Filialsuche (RC 18-2-0)/63_Testfall',  null)])
