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


RunConfiguration.setExecutionSettingFile('C:\\Users\\vr-test\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Prototyp_Akkordeons (RC 18-2-0)\\08_FAQSeiteSindAlleZuBeginnGeschlossen\\20180403_120556\\execution.properties')

TestCaseMain.beforeStart()
try {
    
	    TestCaseMain.runTestCase('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/08_FAQSeiteSindAlleZuBeginnGeschlossen', new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/08_FAQSeiteSindAlleZuBeginnGeschlossen', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/08_FAQSeiteSindAlleZuBeginnGeschlossen')
}
