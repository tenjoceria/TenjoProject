import internal.GlobalVariable

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





CustomKeywords.'com.database.mysql.connectDB'(GlobalVariable.Host_user, GlobalVariable.dbname_user, GlobalVariable.port_User, GlobalVariable.username_user, GlobalVariable.password_user)

/*
def id = CustomKeywords.'com.database.mysql.executeQuery'("SELECT * FROM users WHERE phone = '+62"+GlobalVariable.username+"'")
	id.next()
	
	String user_id = id.getObject("id")
	println(user_id)
	
def user_busines = CustomKeywords.'com.database.mysql.executeQuery'("SELECT * FROM user_businesses WHERE user_id = "+user_id)
	user_busines.next()

	String busineess_id = user_busines.getObject("business_id")
	println(busineess_id)	
	
CustomKeywords.'com.database.mysql.closeDatabaseConnection'()


CustomKeywords.'com.database.mysql.connectDB'(GlobalVariable.Host_B2B, GlobalVariable.dbname_B2B, GlobalVariable.port_B2B, GlobalVariable.username_B2B, GlobalVariable.password_B2B)

def user_id_busines = CustomKeywords.'com.database.mysql.executeQuery'("SELECT * FROM businesses WHERE id ="+busineess_id)
	user_id_busines.next()
	
	String name = user_id_busines.getObject("name")
	println(name)
	
CustomKeywords.'com.database.mysql.closeDatabaseConnection'()
*/



	


