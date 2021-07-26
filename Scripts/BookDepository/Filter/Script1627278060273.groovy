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

WebUI.click(findTestObject('Object Repository/Bookrepository Filter/Page_Book Depository Free delivery worldwid_2a0cdb/a_Sign inJoin'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Filter/Page_Free delivery worldwide on all books f_e26f81/input_Email_email'), 
    'jomotovlog21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Filter/Page_Free delivery worldwide on all books f_e26f81/input_Book Depository password_password'), 
    'VCpouP4dPdbkg5MhfLx4Mw==')

WebUI.click(findTestObject('Object Repository/Bookrepository Filter/Page_Book Depository Free delivery worldwid_2a0cdb/a_Art  Photography'))

WebUI.click(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/a_View all Art  Photography'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'price_low_high', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'price_high_low', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'pubdate_low_high', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'pubdate_high_low', true)

WebUI.click(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/a_Sign out'))

WebUI.click(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/div_Showing 1 to 30 of 1,869,143 results   _1e50ad'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'price_low_high', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'price_high_low', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'pubdate_low_high', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Filter/Page_Art  Photography Books  Book Depository/select_Most popularPrice, low to highPrice,_87996e'), 
    'popularity', true)

WebUI.closeBrowser()

