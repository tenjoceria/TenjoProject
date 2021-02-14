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
import java.text.SimpleDateFormat
import org.openqa.selenium.Keys

KeywordUtil.logInfo("Create Variable Paket Produk For Input")
	String ObjectBuatPaketBaru="Buat Paket Baru"
	String TerapkanTokoCabang=" Terapkan di Toko Cabang "
	String NamaPaket="Paket Beras"
	String DeskripsiPaket="Paket Beras"
	String PilihTokoCabang="Pilih Toko Cabang"
	String TokoCabang1="Toko Cabang Menceng"
	String TokoCabang2="Toko Cabang Kamal Raya"
	String Syarat="Saya menyetujui & Membaca bahwa material promosi berikut "
	String ObjectHargaPerTier="Harga per Tier"
	String NamaProduct="Marlboro Red 20 Test"
	String NamaProduct1="Beras Super"
	String ClickNamaProduct=" Marlboro Red 20 Test "
	String ClickNamaProduct1=" Beras Super "
	String JumlahKemasan=" Bungkus "
	String JumlahKemasan1=" Karung "
	String JumlahProduct="1"
	String JumlahProduct1="1"

KeywordUtil.logInfo("Open Browser")
	WebUI.openBrowser(GlobalVariable.password)

KeywordUtil.logInfo("MaximizeWindow")
	WebUI.maximizeWindow()
	WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Input_User_Name'), 5)

KeywordUtil.logInfo("Input User Name And Password")
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_User_Name'), GlobalVariable.username_username)
	WebUI.setText(findTestObject('Object Repository/LoginPage/Input_Password'), GlobalVariable.password)

if (GlobalVariable.password=="https://mitra.qa.src.id")
{
	WebUI.click(findTestObject('Object Repository/LoginPage/Terima_Semua_Cookie'))
	WebUI.delay(2)
}

KeywordUtil.logInfo("Button Login")
	WebUI.click(findTestObject('Object Repository/LoginPage/Button_masuk'))

KeywordUtil.logInfo("Check Element Home Pages")
	WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/Text_Home'), 20)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Paket Product")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Paket_Product'))
	
KeywordUtil.logInfo("Check Elemnt Daftar Paket")
	WebUI.waitForElementPresent(findTestObject('Paket_Product/View_Paket_Product/Object_Daftar_Paket'), 20, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Tambah Produk")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Tambah_Product'))
	
KeywordUtil.logInfo("Check Object Buat Paket Baru")
	WebUI.waitForElementPresent(CustomKeywords.'dinamic_object.object.span'(ObjectBuatPaketBaru), 20)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Input Nama Paket")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Input_Nama_Paket'),
	NamaPaket)
	
KeywordUtil.logInfo("Input Deskirpsi Paket")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Deskripsi_Paket'),
	DeskripsiPaket)
	
KeywordUtil.logInfo("Check Object Buat Paket Baru")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(TerapkanTokoCabang))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/DropDown_Pilih_Toko_Cabang'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang Mwnceng")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(TokoCabang1))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang Kamal Raya")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(TokoCabang2))
	WebUI.delay(1)
	
WebUI.sendKeys(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/DropDown_Pilih_Toko_Cabang'),
					((Keys.ESCAPE) as String))
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Scrol Object HargaPerTier")
	WebUI.scrollToElement(CustomKeywords.'dinamic_object.object.span'(ObjectHargaPerTier), 20)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang Kamal Raya")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(Syarat))
	
KeywordUtil.logInfo("Click Product")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Product'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Nama Product")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Input_Nama_Product'), 
		NamaProduct)
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Nama Product")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(ClickNamaProduct))
	
KeywordUtil.logInfo("Click Kemasan")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Kemasan'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Kemasan")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Kemasan'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Jumlah Kemasan")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(JumlahKemasan))
	
KeywordUtil.logInfo("Click Jumlah")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Jumlah'))
	
KeywordUtil.logInfo("Input Jumlah Product")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Jumlah'), 
		JumlahProduct)
	
KeywordUtil.logInfo("Click Tambah Daftar Produk")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Button_Daftar_Product'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Product1")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Product1'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Nama Product1")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Input_Nama_Product1'),
		NamaProduct1)
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Nama Product1")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(ClickNamaProduct1))
	
KeywordUtil.logInfo("Click Kemasan1")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Kemasan1'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Jumlah Kemasan1")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(JumlahKemasan1))
	
KeywordUtil.logInfo("Click Jumlah1")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Jumlah1'))
	
KeywordUtil.logInfo("Input Jumlah Product1")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Click_Jumlah1'),
		JumlahProduct1)

	
	
	
	
	
	
	
	
	

	
	
	