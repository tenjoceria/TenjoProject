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
import com.kms.katalon.core.util.KeywordUtil

KeywordUtil.logInfo("Open Browser")
	WebUI.openBrowser(GlobalVariable.password)

KeywordUtil.logInfo("MaximizeWindow")
	WebUI.maximizeWindow()
	WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Input_User_Name'), 5)
	
KeywordUtil.logInfo("Input User Name And Password")
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_User_Name'), GlobalVariable.username_username)
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_Password'), GlobalVariable.password)
	
if (GlobalVariable.password=="https://mitra.qa.src.id"){
WebUI.click(findTestObject('Object Repository/LoginPage/Terima_Semua_Cookie'))
WebUI.delay(2)
}

KeywordUtil.logInfo("Button Login")
	WebUI.click(findTestObject('Object Repository/LoginPage/Button_masuk'))

KeywordUtil.logInfo("Check Element Home Pages")
	WebUI.waitForElementPresent(findTestObject('LoginPage/Text_Home'), 20)

KeywordUtil.logInfo("Click Menu Paket Product")
	WebUI.click(findTestObject('Paket_Product/Create_Paket_Product/Click_Paket_Product'))

KeywordUtil.logInfo("Check Elemnt Daftar Paket")
	WebUI.waitForElementPresent(findTestObject('Paket_Product/View_Paket_Product/Object_Daftar_Paket'), 20, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("Create Variable Paket Produk For Input")
	String PaketProduk="Paket Makanan"

KeywordUtil.logInfo("Input Text Base On variable Paket Produk")
	WebUI.setText(findTestObject('Product/View_Product/Search'), PaketProduk)
	WebUI.delay(3)

KeywordUtil.logInfo("Click Object Nama Paket Produk")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(PaketProduk))
	
KeywordUtil.logInfo("Check Element Detail Paket Product")
	WebUI.waitForElementPresent(findTestObject('Paket_Product/View_Paket_Product/Detail_Paket_Produk'), 20)


//WebUI.closeBrowser()

