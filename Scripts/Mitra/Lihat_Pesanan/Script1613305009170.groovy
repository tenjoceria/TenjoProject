import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
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
import java.text.SimpleDateFormat

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import org.openqa.selenium.Keys
import java.text.SimpleDateFormat
import org.openqa.selenium.Keys as Keys

//function connect DB
def connecting () {
	CustomKeywords.'com.database.mysql.connectDB'(GlobalVariable.Host_user, GlobalVariable.dbname_user, GlobalVariable.port_User, GlobalVariable.username_user, GlobalVariable.password_user)
	}

//function close DB
def closeconnecting () {
	CustomKeywords.'com.database.mysql.closeDatabaseConnection'()
	}

KeywordUtil.logInfo("Open Browser")
	WebUI.openBrowser(GlobalVariable.url)

KeywordUtil.logInfo("MaximizeWindow")
	WebUI.maximizeWindow()
	WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Input_User_Name'), 5)

	WebUI.takeScreenshot()

KeywordUtil.logInfo("Input User Name And Password")
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_User_Name'), GlobalVariable.username)
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_Password'), GlobalVariable.password)

if (GlobalVariable.url=="https://mitra.qa.src.id")
{
	WebUI.click(findTestObject('Object Repository/LoginPage/Terima_Semua_Cookie'))
	WebUI.delay(2)
}


	WebUI.takeScreenshot()

KeywordUtil.logInfo("Button Login")
	WebUI.click(findTestObject('Object Repository/LoginPage/Button_masuk'))

KeywordUtil.logInfo("Check Element Home Pages")
	WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Text_Home'), 20)
	WebUI.delay(1)

	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Icon Notifikasi")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_LihatPesanan/Icon_Notifikasi'))
	


	