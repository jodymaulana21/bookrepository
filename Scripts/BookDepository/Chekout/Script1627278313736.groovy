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

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Book Depository Free delivery worldwid_2a0cdb/a_Sign inJoin'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Free delivery worldwide on all books f_e26f81/input_Email_email'), 
    'jomotovlog21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bookrepository Chekout/Page_Free delivery worldwide on all books f_e26f81/input_Book Depository password_password'), 
    'VCpouP4dPdbkg5MhfLx4Mw==')

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Book Depository Free delivery worldwid_2a0cdb/a_Add to basket'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Book Depository Free delivery worldwid_2a0cdb/a_Basket  Checkout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/a_Childrens Books'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Childrens Books  Book Depository/a_Add to basket'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Childrens Books  Book Depository/a_Basket  Checkout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910_1'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/button_remove'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/button_remove'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/a_Browse Bestsellers'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Bestselling books online with free del_de2365/a_Sign out'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Bestselling books online with free del_de2365/a_Add to basket'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Bestselling books online with free del_de2365/a_Basket  Checkout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '10', true)

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '100000')

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/p_Rp1.428.290'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/div_Where the Crawdads Sing                _4f3e60'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '9')

WebUI.sendKeys(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), Keys.chord(
        Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/select_12345678910'), 
    '10', true)

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '1000000000000000000000000000000000000000000')

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/div_UpdateRp1.428.290remove'))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/button_Update'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '1000')

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/button_Update'))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '1000')

WebUI.sendKeys(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '100')

WebUI.sendKeys(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '1000')

WebUI.sendKeys(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), '1000')

WebUI.sendKeys(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/input_Rp179.334_quantity'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Bookrepository Chekout/Page_Your basket/button_remove'))

WebUI.closeBrowser()

