package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object dump_folder
     
    /**
     * <p></p>
     */
    public static Object urls_list
     
    /**
     * <p></p>
     */
    public static Object hide_elements
     
    /**
     * <p></p>
     */
    public static Object urls_list_mobile
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('INDI', allVariables['default'] + ['dump_folder' : '~/INDI_Mobile', 'urls_list' : '/Test Suites/INDI_Mobile/sitemap.txt', 'hide_elements' : '/Test Suites/INDI_Mobile/hide_elements.js', 'urls_list_mobile' : '/Test Suites/INDI_Mobile/sitemap_mobile.txt'])
        allVariables.put('Prototyp', allVariables['default'] + ['dump_folder' : '~/Prototyp', 'urls_list' : '/Test Suites/Prototyp/sitemap.txt', 'hide_elements' : '/Test Suites/Prototyp/hide_elements.js', 'urls_list_mobile' : '/Test Suites/Prototyp/sitemap_mobile.txt'])
        allVariables.put('VR_PROD', allVariables['default'] + ['dump_folder' : '~/VR_PROD', 'urls_list' : '/Test Suites/VR_PROD/sitemap.txt', 'hide_elements' : '/Test Suites/VR_PROD/hide_elements.js', 'urls_list_mobile' : '/Test Suites/VR_PROD/sitemap_mobile.txt'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        dump_folder = selectedVariables['dump_folder']
        urls_list = selectedVariables['urls_list']
        hide_elements = selectedVariables['hide_elements']
        urls_list_mobile = selectedVariables['urls_list_mobile']
        
    }
}
