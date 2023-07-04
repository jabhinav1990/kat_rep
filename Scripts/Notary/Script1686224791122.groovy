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

WebUI.navigateToUrl('http://botsdna.com/')

WebUI.click(findTestObject('Object Repository/Page_botsDNA/i_Course_fa fa-money'))

WebUI.setText(findTestObject('Object Repository/Page_botsDNA-Notary/input_NOTARY ADVOCATE NAME_notary'), 'Adv')

WebUI.setText(findTestObject('Object Repository/Page_botsDNA-Notary/input_AREA OF PRACTICE_area'), 'Ggn')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_botsDNA-Notary/select_VIZIANAGARAM    VISAKHAPATNAM    EAS_289dcc'), 
    'VIZIANAGARAM', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_botsDNA-Notary/select_VIZIANAGARAM    VISAKHAPATNAM    EAS_289dcc'), 
    'NELLORE', true)

WebUI.click(findTestObject('Object Repository/Page_botsDNA-Notary/input_button'))

WebUI.click(findTestObject('Object Repository/Page_/img'))

WebUI.click(findTestObject('Object Repository/Page_/img'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_/img'), '')

WebUI.navigateToUrl('https://trinityedge.trinitylifesciences.com/')

WebUI.click(findTestObject('Object Repository/Page_Trinity Edge/button_Sign in'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

