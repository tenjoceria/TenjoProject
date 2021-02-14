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


KeywordUtil.logInfo("Open apps")

WebUI.openBrowser(GlobalVariable.password)

WebUI.maximizeWindow()
WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Input_User_Name'), 5)

WebUI.setText(findTestObject('Object Repository/LoginPage/Input_User_Name'), GlobalVariable.username_username)

WebUI.setText(findTestObject('Object Repository/LoginPage/Input_Password'), GlobalVariable.password)
if (GlobalVariable.password=="https://mitra.qa.src.id"){

WebUI.click(findTestObject('Object Repository/LoginPage/Terima_Semua_Cookie'))
WebUI.delay(2)
}

WebUI.click(findTestObject('Object Repository/LoginPage/Button_masuk'))

WebUI.waitForElementPresent(findTestObject('LoginPage/Text_Home'), 20)

WebUI.click(findTestObject('Product/View_Product/Click_Product'))

WebUI.waitForElementPresent(findTestObject('Product/View_Product/Object_Daftar_Produk'), 20, FailureHandling.STOP_ON_FAILURE)

String ProductName="Red Bull"

WebUI.setText(findTestObject('Product/View_Product/Search'), ProductName)

WebUI.delay(3)

WebUI.scrollToElement(CustomKeywords.'dinamic_object.object.span'(ProductName), 10)

WebUI.click(CustomKeywords.'dinamic_object.object.span'(ProductName))

WebUI.waitForElementPresent(findTestObject('Product/View_Product/Detail_Produk'), 20)

