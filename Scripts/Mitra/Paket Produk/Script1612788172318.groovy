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
import org.openqa.selenium.Keys
import java.text.SimpleDateFormat

KeywordUtil.logInfo("Create Variable Paket Produk For Input")
	String NamaPaket="Paket Omen Tipes"
	String DeskripsiPaket="Paket Omen Tipes"
	String PilihTokoCabang="Pilih Toko Cabang"
	String TokoCabang1="Toko Cabang Menceng"
	String TokoCabang2="Toko Cabang Kamal Raya"
	String ObjectHargaPerTier="Harga per Tier"
	String NamaProduct="Beras Cianjur"
	String NamaProduct2="Beras Super"
	String JumlahKemasan="Karung"
	String JumlahKemasan2="Karung"
	String JumlahProduct="1"
	String JumlahProduct2="1"
	String hargaDiskon="90000"

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
	
KeywordUtil.logInfo("Click Paket Product")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/menu_paketProduk'))
	
KeywordUtil.logInfo("Check Elemnt Daftar Paket")
	WebUI.waitForElementPresent(findTestObject('Sidebar/menu_PaketProduk/verifyElement_paketProduk'), 20, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Tambah Produk")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/button_tambahProduk'))
	
KeywordUtil.logInfo("Check Object Buat Paket Baru")
	WebUI.waitForElementPresent(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/verifyElement_buatPaketBaru'), 20)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Input Nama Paket")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_namaPaket'),
	NamaPaket)
	
KeywordUtil.logInfo("Input Deskirpsi Paket")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_deskripsiPaket'),
	DeskripsiPaket)
	
KeywordUtil.logInfo("Check Terapkan di Toko Cabang")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/checkbox_TerapkanTokoCabang'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Pilih Toko Cabang")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_PilihTokoCabang'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang Mwnceng")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(TokoCabang1))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Pilih Toko Cabang Kamal Raya")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(TokoCabang2))
	WebUI.delay(1)
	
WebUI.sendKeys(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/DropDown_Pilih_Toko_Cabang'),
	((Keys.ESCAPE) as String))

	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Scroll to Object HargaPerTier")
	WebUI.scrollToElement(CustomKeywords.'dinamic_object.object.span'(ObjectHargaPerTier), 20)
	
KeywordUtil.logInfo("Checklist Setuju")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/checkbox_SayaMenyetujui'))
	
KeywordUtil.logInfo("Pilih Product")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_namaProduk'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Nama Product")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_namaProduk'), 
		NamaProduct)
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Nama Product")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(" "+NamaProduct+" "))
	
KeywordUtil.logInfo("Pilih Kemasan")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_kemasan'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Pilih Kemasan")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_kemasan'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Jumlah Kemasan")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(" "+JumlahKemasan+" "))
	
KeywordUtil.logInfo("Input Jumlah")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_jumlah'))
	
KeywordUtil.logInfo("Input Jumlah Product")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_jumlah'), 
		JumlahProduct)

KeywordUtil.logInfo("Click Tambah Daftar Produk")
	WebUI.click(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Button_Daftar_Product'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Pilih Produk 2")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_namaProduk2'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Input Nama Product2")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_namaProduk2'),
		NamaProduct2)
	WebUI.delay(2)
	
KeywordUtil.logInfo("Click Nama Product2")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(" "+NamaProduct2+" "))
	
KeywordUtil.logInfo("Click Kemasan2")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_kemasan2'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Kemasan2")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/dropdown_kemasan2'))
	
KeywordUtil.logInfo("Pilih Jumlah Kemasan2")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(" "+JumlahKemasan2+" "))
	
KeywordUtil.logInfo("Click Jumlah2")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_jumlah2'))
	
KeywordUtil.logInfo("Input Jumlah Product2")
	WebUI.setText(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_jumlah2'),
		JumlahProduct2)
	
KeywordUtil.logInfo("Scroll to Object HargaPerTier")
	WebUI.scrollToElement(CustomKeywords.'dinamic_object.object.span'(ObjectHargaPerTier), 20)
	
KeywordUtil.logInfo("Get Attribute value")
	String value = WebUI.getAttribute(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/Input_hargaNormal'), 'formcontrolname')
	
	println(value)


KeywordUtil.logInfo("Input Potongan Harga")
	WebUI.setText(findTestObject('Sidebar/menu_PaketProduk/create paket produt/input_hargaDiskon'),
		hargaDiskon)

//Start date
	def date = new Date()
	def today = date.format('d')
	
//future date
	Date editStart = date.plus(7)
	String expired_date = editStart.format('d')
		
KeywordUtil.logInfo("Click Icon Tanggal")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/icon_tanggal'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Icon Tanggal")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/icon_tanggal'))
	WebUI.delay(1)
	
KeywordUtil.logInfo("Click Tanggal Expired")
	WebUI.click(CustomKeywords.'dinamic_object.object.div'(expired_date))
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Tanggal Expired")
	WebUI.scrollToElement(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/verifyElement_buatPaketBaru'), 20)

KeywordUtil.logInfo("Click Tab Gambar Produk")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/tab_gambarProduk'))
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Upload File")
	WebUI.uploadFile(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/input_file'),
		"/Users/gagasjulio/Downloads/Beras Super.jpeg")
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click Simpan")
	WebUI.click(findTestObject('Object Repository/Sidebar/menu_PaketProduk/create paket produt/button_simpan'))

KeywordUtil.logInfo("Verification Sucses Massage")
	WebUI.verifyElementPresent(findTestObject(
		'Object Repository/Sidebar/menu_PaketProduk/create paket produt/verifyElement_dataBerhasildiSimpan'), 10)
	
	WebUI.takeScreenshot()

KeywordUtil.logInfo("Verfy Daftar Paket setelah Simpan")
	WebUI.setText(findTestObject('Object Repository/Paket_Product/Create_Paket_Product/search_NamaPaket'), NamaPaket)
	WebUI.delay(2)

KeywordUtil.logInfo("Click Nama Paket setelah Simpan")
	WebUI.click(CustomKeywords.'dinamic_object.object.span'(NamaPaket))
	
KeywordUtil.logInfo("Verify Detail Paket Produk")
	WebUI.verifyElementPresent(CustomKeywords.'dinamic_object.object.span'("Detail Paket Produk"), 5)
	
	WebUI.takeScreenshot()
	
	
	

	

	
	
	