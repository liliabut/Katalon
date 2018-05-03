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


suiteProperties.put('id', 'Test Suites/Akk')

suiteProperties.put('name', 'Akk')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\vr-test\\git\\Katalon\\Reports\\Akk\\20180503_115729\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Akk', suiteProperties, [new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/01_DetailseiteKorrekteAkkordeonsOffen', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/01_DetailseiteKorrekteAkkordeonsOffen',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/02_DetailseiteAkkordeonsInAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/02_DetailseiteAkkordeonsInAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/03_DetailseiteKorrektesOeffnenVonAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/03_DetailseiteKorrektesOeffnenVonAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/04_DisabledSeiteKorrekteAkkordeonsZuBeginnOffen', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/04_DisabledSeiteKorrekteAkkordeonsZuBeginnOffen',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/05_DisabledSeiteKorrektesOeffnenVonAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/05_DisabledSeiteKorrektesOeffnenVonAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/06_FAQSeiteAkkordeonsInAkkordeon', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/06_FAQSeiteAkkordeonsInAkkordeon',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/07_FAQSeiteKoennenAlleGeoeffnetWerden', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/07_FAQSeiteKoennenAlleGeoeffnetWerden',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/08_FAQSeiteSindAlleZuBeginnGeschlossen', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/08_FAQSeiteSindAlleZuBeginnGeschlossen',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/09_OverviewSeiteAkkordeonsInAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/09_OverviewSeiteAkkordeonsInAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/10_OverviewSeiteFAQAkkordeonsInAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/10_OverviewSeiteFAQAkkordeonsInAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/11_OverviewSeiteKoennenAlleFAQsGeoeffnetWerden', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/11_OverviewSeiteKoennenAlleFAQsGeoeffnetWerden',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/12_OverviewSeiteKorrektesOeffnenDerAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/12_OverviewSeiteKorrektesOeffnenDerAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/13_OverviewSeiteKorrektesOeffnenDerAkkordeonsTeil2', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/13_OverviewSeiteKorrektesOeffnenDerAkkordeonsTeil2',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/14_OverviewSeiteSindKorrekteAkkordeonsZuBeginnOffen', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/14_OverviewSeiteSindKorrekteAkkordeonsZuBeginnOffen',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/15_SuchergebnisSeiteKorrektesOeffnenDerAkkordeons', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/15_SuchergebnisSeiteKorrektesOeffnenDerAkkordeons',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/16_SuchergebnisSeiteSindKorrekteAkkordeonsOffenZuBeginn', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/16_SuchergebnisSeiteSindKorrekteAkkordeonsOffenZuBeginn',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/17_AccordionContactsSeite', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/17_AccordionContactsSeite',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/18_OverviewSeite_Rest_Akk', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/18_OverviewSeite_Rest_Akk',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/19_AccordionInTabBeratung', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/19_AccordionInTabBeratung',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/20_AccordionContaktSeiteInitial', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/20_AccordionContaktSeiteInitial',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/21_AccordionDisabledSeiteInitial', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/21_AccordionDisabledSeiteInitial',  null), new TestCaseBinding('Test Cases/Prototyp_Akkordeons (RC 18-2-0)/22_Accordionsuchergebnis2SeiteInitial', 'Test Cases/Prototyp_Akkordeons (RC 18-2-0)/22_Accordionsuchergebnis2SeiteInitial',  null)])
