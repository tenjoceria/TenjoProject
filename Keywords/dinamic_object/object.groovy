package dinamic_object

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class object {
	@Keyword
	def span(String tittle){
		def sugest = new TestObject('Object Repository/Page_Mitra/Text_Home')
		sugest.addProperty( "xpath", ConditionType.EQUALS, "//span[(text() = '"+tittle+"' or . = '"+tittle+"')]", true)
	}
	@Keyword
	def input(String inputtext){
		def sugest = new TestObject('Object Repository/Page_Mitra/Text_Home')
		sugest.addProperty( "xpath", ConditionType.EQUALS, "//span[(text() = '"+inputtext+"' or . = '"+inputtext+"')]", true)
	}
	@Keyword
	def div(String inputtext){
		def sugest = new TestObject('Object Repository/Page_Mitra/Text_Home')
		sugest.addProperty( "xpath", ConditionType.EQUALS, "//div[(text() = '"+inputtext+"' or . = '"+inputtext+"')]", true)
	}
}