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

WebUI.navigateToUrl('https://www.bookdepository.com/')

WebUI.click(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Free delivery worldwid_2a0cdb/a_Sign inJoin'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Name_customerName'), 
    'jody')

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Your email address_email'), 
    'maladroidcln@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Create a password_password'), 
    'qVtqYJeSqhOhbhXxy4fWFA==')

WebUI.click(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Show password_continue'))

WebUI.doubleClick(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Free delivery worldwid_2a0cdb/a_Sign inJoin'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Email_email'), 
    'mwasjadahi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Registration/Page_Free delivery worldwide on all books f_e26f81/input_Book Depository password_password'), 
    'qVtqYJeSqhOhbhXxy4fWFA==')

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Email_email'), 
    'jomotovlog21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Book Depository password_password'), 
    'BTr44iJB0EJ2PREjOza4cg==')

WebUI.click(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/div_There was a problem                    _636b21'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Email_email'), 
    'maladroidcln@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Book Depository password_password'), 
    'VCpouP4dPdbkg5MhfLx4Mw==')

WebUI.click(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/div_There was a problem                    _636b21'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Email_email'), 
    'jomotovlog21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Sign-In/input_Book Depository password_password'), 
    'VCpouP4dPdbkg5MhfLx4Mw==')

WebUI.click(findTestObject('Object Repository/Bookrepository Registration/Page_Book Depository Free delivery worldwid_2a0cdb/a_Sign out'))

WebUI.closeBrowser()

