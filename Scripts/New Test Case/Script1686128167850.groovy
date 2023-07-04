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

WebUI.navigateToUrl('https://dmi-qa.trinitylifesciences.com/umbraco')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login - Login - Umbraco - dmi-qa.trini_df85fb/input_Email_username'), 
    'ajain@trinitylifesciences.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Login - Umbraco - dmi-qa.trini_df85fb/input_Password_password'), 
    '4KQ7U//h1gzWg2ooSoiakw==')

WebUI.click(findTestObject('Object Repository/Page_Login - Login - Umbraco - dmi-qa.trini_df85fb/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Content - dmi-qa.trinitylifesciences.com/svg_fa-secondaryopacity.4'))

WebUI.click(findTestObject('Page_Content - dmi-qa.trinitylifesciences.com/2'))

WebUI.click(findTestObject('Page_Content - dmi-qa.trinitylifesciences.com/3'))

WebUI.click(findTestObject('Page_Content - dmi-qa.trinitylifesciences.com/4'))

WebUI.click(findTestObject('Page_Content - dmi-qa.trinitylifesciences.com/5'))

WebUI.click(findTestObject('Object Repository/Page_Content - dmi-qa.trinitylifesciences.com/a_Web Articles'))

WebUI.click(findTestObject('Object Repository/Page_Edit Web Articles - Content - dmi-qa.t_a2edca/button_Create Web Article'))

WebUI.setText(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/input_Web Article Name_headerName'), 
    'KS1')

WebUI.setText(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/input_Date the article was published_datepicker'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/input_Date the article was published_datepicker'))

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/span_8'))

WebUI.setText(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/input_Address to the article_textbox'), 
    'https://google.com')

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/span_None_umb-form-check__check'))

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/div_COVID-19 KS'))

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/span_Save and publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_New Web Article - Content - dmi-qa.tri_54c7cb/strong_Content published'), 
    'Content published:')

