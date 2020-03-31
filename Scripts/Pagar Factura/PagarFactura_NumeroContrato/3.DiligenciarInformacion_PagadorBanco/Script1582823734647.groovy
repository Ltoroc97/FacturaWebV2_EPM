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

WebUI.setText(findTestObject('PagarFactura/FinalizarPago/Campo_CorreoEletronicoPagos'), 'marcela.ocampo9@gmail.com')

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/BotonIrBanco'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/PagiaPrincipal_PSE'))

not_run: WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/BotonPAY'))

not_run: WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/MensajeConfirmacion'))

not_run: WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/a_Cerrar'))

not_run: WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/EstadoAprbado'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/BotonDebug'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/VisualizarPaginaPrincipal_Debug'))

WebUI.setText(findTestObject('PagarFactura/FinalizarPago/CampoBankProcessDate'), '02/03/2020')

WebUI.setText(findTestObject('Object Repository/PagarFactura/FinalizarPago/CampoAuthorizationID'), '12')

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/BotonCall'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/VisualizarEstadoFinalTransaccion'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/BotonReturnToPPE'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/EstadoFinalTransaccion_FacturaWeb'))

WebUI.click(findTestObject('PagarFactura/FinalizarPago/a_Cerrar'))

WebUI.click(findTestObject('Object Repository/PagarFactura/FinalizarPago/span_APROBADA'))

