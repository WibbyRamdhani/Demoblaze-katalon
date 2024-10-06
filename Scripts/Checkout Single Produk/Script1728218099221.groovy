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

WebUI.click(findTestObject('Checkout/MenuPhones'))

WebUI.click(findTestObject('Checkout/HP'))

WebUI.click(findTestObject('AddToCard/AddToCard'))

WebUI.click(findTestObject('Checkout/btnheaderCart'))

WebUI.click(findTestObject('Checkout/btnOrder'))

WebUI.setText(findTestObject('Object Repository/Checkout/input_Name_name'), GlobalVariable.nama)

WebUI.setText(findTestObject('Object Repository/Checkout/input_Country_country'), GlobalVariable.country)

WebUI.setText(findTestObject('Object Repository/Checkout/input_City_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Repository/Checkout/input_Credit card_card'), GlobalVariable.cc)

WebUI.setText(findTestObject('Object Repository/Checkout/input_Month_month'), GlobalVariable.bulan)

WebUI.setText(findTestObject('Object Repository/Checkout/input_Year_year'), GlobalVariable.thn)

WebUI.click(findTestObject('Checkout/button_Purchase'))

WebUI.verifyElementText(findTestObject('Checkout/verifelement'), 'Thank you for your purchase!')

WebUI.click(findTestObject('Checkout/btnsuksesorder'))

WebUI.click(findTestObject('Checkout/btn_logout'))

