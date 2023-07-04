import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dds-terra-test.trinityappmarketplace.com/login')

WebUI.setText(findTestObject('Object Repository/Page_DDS - Terra/input_DDS TERRA_input-text ng-untouched ng-_832bf7'), 'terrasso')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DDS - Terra/input_DDS TERRA_input-text ng-untouched ng-_399ea0'), 
    'J4Y845lzH/+oYGWpt2oeRg==')

WebUI.click(findTestObject('Object Repository/Page_DDS - Terra/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Terra/span_DDS Extractors'))

WebUI.switchToWindowTitle('DDS - Extractors')

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/img'))

WebUI.setText(findTestObject('Object Repository/Page_DDS - Extractors/input__input_ul small ant-input ng-tns-c181_c074de'), 
    'Name1 Ext')

WebUI.setText(findTestObject('Object Repository/Page_DDS - Extractors/textarea__input_ul small ant-input ng-tns-c_8a0922'), 
    'Desc1 Ext')

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_Select source system'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_AWS'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/li_Amazon SFTP'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_567348'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_amazon_sftp_connection_cloudqa'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/nz-select-top-control_Select source bucket'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_dcube-dds-terra-extractors-source-test'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_Select file format'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_Structured Files'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/li_CSV'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/img_1'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/svg'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/nz-tree-node-switcher_test_ant-tree-switche_7e597d'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/span_Date_Transformation.csv'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/button_Choose'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/nz-select-top-control_Select'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_True'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_Select target system'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/img_1_2'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_567348_1'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_Snowflake_Connection_Cloudqa'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_567348_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_c0012c'), 
    'snowflake_test')

WebUI.sendKeys(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_c0012c'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_c0012c'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_PUBLIC'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Page_DDS - Extractors/input_PURPLELABS_CLAIMS_DATA_mb-1 ant-input'), 'TT2')

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/button_Add item'))

WebUI.scrollToElement(findTestObject('Page_DDS - Extractors/a'), 0)

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/div_TT2'))

WebUI.click(findTestObject('Object Repository/Page_DDS - Extractors/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_DDS - Extractors/th_Transformations'), 'Transformations')

