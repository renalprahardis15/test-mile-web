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

WebUI.navigateToUrl('https://taskdev.mile.app/login')

WebUI.setText(findTestObject('Page_Mile.app  Login/Organization_OR/input_Back to Mile_organization'), 'testonboard')

WebUI.click(findTestObject('Page_Mile.app  Login/Organization_OR/span_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Login/Organization_OR/p_Sign in to your account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Login/Account_OR/img'), 0)

WebUI.setText(findTestObject('Page_Mile.app  Login/Account_OR/input_Email Address or Username_email or username'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mile.app  Login/Account_OR/input_Password_password'), '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/Page_Mile.app  Login/Account_OR/span_Password_el-checkbox__inner'))

WebUI.click(findTestObject('Object Repository/Page_Mile.app  Login/Account_OR/span_Login'))

WebUI.verifyTextPresent('Login failed, please check your email or password.', false)

WebUI.closeBrowser()

