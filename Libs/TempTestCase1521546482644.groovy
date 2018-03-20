import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/v3/3544ydt17zz8kpf8ftlyg3tm0000gn/T/Katalon/Test Cases/Prototyp_Filialsuche (RC 18)/40_Testfall/20180320_124752/execution.properties')

TestCaseMain.beforeStart()
try {
    
	    TestCaseMain.runTestCase('Test Cases/Prototyp_Filialsuche (RC 18)/40_Testfall', new TestCaseBinding('Test Cases/Prototyp_Filialsuche (RC 18)/40_Testfall', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Prototyp_Filialsuche (RC 18)/40_Testfall')
}
