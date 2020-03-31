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

WebUI.setText(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_email'), 'marcela.ocampo9@gmail.com')

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/button_IrAlBanco'))

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/button_Debug'))

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_BankProcessDate'))

WebUI.setText(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_BankProcessDate'), 
    '31/03/2020')

WebUI.setText(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_AuthorizationID'), 
    '12')

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/button_Call'))

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/view_DebugConfirmTransactionPayment'))

WebUI.closeBrowser()

