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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('PagarFactura/IngresarInformacionPago/Check_SeleccionaParaPagar'))

WebUI.click(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/Boton_IniciarPago'))

WebUI.click(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/a_Estoy seguro quiero continuar'))

WebUI.click(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/a_Cerrar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/SeleccionarBanco'), '78', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/SeleccionarTipoPersona'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/Campo_NumeroDocumentoPagador'), '103667214')

WebUI.click(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/Boton_PagarPSE'))

WebUI.click(findTestObject('Object Repository/PagarFactura/IngresarInformacionPago/a_Continuar'))

