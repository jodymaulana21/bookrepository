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

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Book Depository Free delivery worldwid_2a0cdb/img_Bestselling Books_lazy loaded'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/a_Add to wishlist'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/span_'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/a_Sign inJoin'))

WebUI.setText(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/input_Email_email'), 
    'jomotovlog21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/input_Book Depository password_password'), 
    'VCpouP4dPdbkg5MhfLx4Mw==')

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/div_Show password'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/i_jody1996_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/input_Keep me signed in_signInSubmit'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/a_Add to wishlist'))

WebUI.setText(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/input_Create new wishlist_wishlistLabel'), 
    '1')

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/button_Add'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/div_Add item to wishlist                  I_18a9c7'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_It Ends With Us The most heartbreaking_c4a28b/a_Adult  Contemporary Romance'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Adult  Contemporary Romance Books  Boo_babcc5/img__lazy loaded'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Normal People  Sally Rooney  9780571334650/a_Add to wishlist'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Normal People  Sally Rooney  9780571334650/button_Add'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Normal People  Sally Rooney  9780571334650/span_'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Normal People  Sally Rooney  9780571334650/i_Wishlist_icon-wishlist'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/a_Copy item to'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/a_Create new wishlist'))

WebUI.setText(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/input_Create new wishlist_wishlistLabel'), 
    'hkhk')

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/button_Add'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/a_Go to hkhk'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/i_Wishlist_icon-wishlist'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/span_1 (Default)'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Your Wishlist/a_Sign out'))

WebUI.click(findTestObject('Object Repository/bookrepository favorit/Page_Free delivery worldwide on all books f_e26f81/a_Wishlist'))

WebUI.closeBrowser()

