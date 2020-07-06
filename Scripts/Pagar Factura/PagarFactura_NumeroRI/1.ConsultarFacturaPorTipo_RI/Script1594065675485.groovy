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

WebUI.callTestCase(findTestCase('Iniciar Sesion/IngresarPaginaPrincipal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/rbtn_tengoFacturaDiferente'))

WebUI.rightClick(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_numeroRI'))

WebUI.setText(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/inputText_numeroRI'), '6603834')

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/btn_consultaYPaga'))

WebUI.click(findTestObject('Object Repository/PagarFactura/PagarFactura_ConsultaNumeroIR/view_resultadoConsulta'))
