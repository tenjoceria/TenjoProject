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

KeywordUtil.logInfo("Click Menu Product")
	WebUI.click(findTestObject('Product/Create_Product/Click_Produk'))

KeywordUtil.logInfo("Check Elemnt Daftar Produk")
	WebUI.waitForElementPresent(findTestObject('Product/Create_Product/Text_Daftar_Produk'), 20, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("Click Button Tambah Product")
	WebUI.click(findTestObject('Product/Create_Product/Click_Tambah_Product'))
	
KeywordUtil.logInfo("Check Elemnt Tambah Produk")
	WebUI.waitForElementPresent(findTestObject('Product/Create_Product/Text_Tambah_Product'), 20, FailureHandling.STOP_ON_FAILURE)
	
KeywordUtil.logInfo("Create Variable Produk For Input")
	//String Barcode="0986551"
	String NamaProduct="Test1"
	String NamaLainProduct="Test2"
	String Perusahaan="PT. Test3"
	String LabelPencarian="Test4"
	String NamaKategori="MAKANAN BEKU"
	String Kemasan="Dust"
	String BeratProduk="100"
	String JumlahPerKemasan="18"
	String HargaProduct="25000"
	String HargaPotongan= "20000"
	
	
//KeywordUtil.logInfo("Input Text Base On variable Barcode")
	//WebUI.setText(findTestObject('Product/Create_Product/Input_Barcode'), Barcode)

KeywordUtil.logInfo("Input Text Base On variable Nama Product")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Nama_Product'), NamaProduct)
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Text Base On variable Nama Lain Product")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Nama_Lain_Product'), NamaLainProduct)
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Text Base On variable Perusahaan")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Perusahaan'), Perusahaan)
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Scrol To Kemasan")
	WebUI.scrollToElement(findTestObject('Product/Create_Product/Text_Kemasan'), 3)
	
KeywordUtil.logInfo("Input Text Base On variable Label Pencarian")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Label_Pencarian'), LabelPencarian)
	
KeywordUtil.logInfo("Click Kategori Product")
	WebUI.click(findTestObject('Product/Create_Product/Click_Kategori_Product'))
	WebUI.delay(2)
	
KeywordUtil.logInfo("Click Kategori Product")
	WebUI.waitForElementPresent(findTestObject('Product/Create_Product/Input_Cari_Kategori'), 2)
	
KeywordUtil.logInfo("Input Kategori Product")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Cari_Kategori'), 
		NamaKategori)
	
KeywordUtil.logInfo("Click Kategori")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(" "+NamaKategori+" "))
	
KeywordUtil.logInfo("Input Kemasan")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Kemasan'),
		Kemasan)
	
KeywordUtil.logInfo("Input Berat Produk")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Berat_Product'),
		BeratProduk)
	
KeywordUtil.logInfo("Input Berat Produk")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Jumlah_PerKemasan'),
		JumlahPerKemasan)
	
KeywordUtil.logInfo("Input Harga Product")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Harga_Product'),
		HargaProduct)
	
KeywordUtil.logInfo("Input Harga Potongan")
	WebUI.setText(findTestObject('Product/Create_Product/Input_Harga_Potongan'),
		HargaPotongan)
	WebUI.delay(1)
	
	//Start date
def date = new Date()
def startDate = date.format('d')

	//future date
Date editStart = date.plus(10)
String endDate = editStart.format( 'd' )
	
KeywordUtil.logInfo("Click Icon Tanggal")
	WebUI.click(findTestObject('Product/Create_Product/Tanggal'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Tanggal")
	WebUI.click(CustomKeywords.'dinamic_object.object.div'(startDate))
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Scrol Text Tambah Product")
	WebUI.scrollToElement(findTestObject('Product/Create_Product/Text_Tambah_Product'), 3)
	
KeywordUtil.logInfo("Click Gambar Product")
	WebUI.click(findTestObject('Product/Create_Product/Gambar_Product'))
	WebUI.delay(3)
	
KeywordUtil.logInfo("Upload")
	WebUI.uploadFile(findTestObject('Product/Create_Product/Input_File'), "/Users/gagasjulio/Downloads/Tajoz.jpeg")
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Button Simpan")
	WebUI.click(findTestObject('Product/Create_Product/Simpan'))
	
KeywordUtil.logInfo("Verification Sucses Massage")
	WebUI.verifyElementPresent(findTestObject('Product/Create_Product/Data_Berhasil_Disimpan'), 10)
	
	WebUI.takeScreenshot()
	
	
	//WebUI.closeBrowser()
	
	
