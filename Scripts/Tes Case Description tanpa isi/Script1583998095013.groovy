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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.setText(findTestObject('Page_Login Admin/input_Email_email'), 'dian')

WebUI.sendKeys(findTestObject('Page_Login Admin/input_Email_email'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Page_Login Admin/input_Password_password'), 'MMS/zmTQxAM=')

WebUI.sendKeys(findTestObject('Page_Login Admin/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Tokobuah Admin -/div_New Product            List Product'))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_Products'))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_New Product'))

WebUI.click(findTestObject('Page_Tokobuah Admin - Products/form_NamePricePhotoDescription'))

WebUI.setText(findTestObject('Page_Tokobuah Admin - Products/input_Name_name'), 'pisang')

WebUI.click(findTestObject('Page_Tokobuah Admin - Products/div_Photo'))

WebUI.setText(findTestObject('Page_Tokobuah Admin - Products/input_Price_price'), '250')

WebUI.setText(findTestObject('Page_Tokobuah Admin - Products/textarea_Description_description'), 'w')

WebUI.click(findTestObject('Page_Tokobuah Admin - Products/input_Description_btn'))

