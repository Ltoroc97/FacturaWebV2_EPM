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

WebUI.callTestCase(findTestCase('Iniciar Sesion/IngresarPaginaPrincipal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/LogoFacturaWeb'))

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/input_Consultar y pagar directamente tu fac_6e3c64'))

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/BotonConsulta_Y_Paga'))

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/Validaciones/Mensaje_CampoRequerido'))

Result = WebUI.getText(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/Validaciones/Mensaje_CampoRequerido'))

System.out.println(Result)

WebUI.verifyEqual(Result, 'La información ingresada no coincide con los datos del sistema, o bien tu factura ya ha sido cancelada. Ten presente que si tu factura es de UNE debes cancelarla a través de http://www.une.com.co. Verifica por favor.')

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/Validaciones/span_La informacin ingresada no coincide co_5542c1'))

WebUI.click(findTestObject('Object Repository/ConsultarContrato_TipoFactura1/Validaciones/a_Cerrar'))