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

WebUI.click(findTestObject('Object Repository/IniciarSesion/a_Inicia tu sesinsi ya ests inscrito'))

WebUI.setText(findTestObject('Object Repository/IniciarSesion/CampoCorreo'), 'Marcela.ocampo9@gmail.com')

WebUI.setText(findTestObject('Object Repository/IniciarSesion/CampoContrasea'), '123')

WebUI.click(findTestObject('Object Repository/IniciarSesion/BotonIngresar'))

WebUI.click(findTestObject('Object Repository/IniciarSesion/Validaciones/Mensaje_CampoInvalido'))

Result =  WebUI.getText('Object Repository/IniciarSesion/Validaciones/Mensaje_CampoInvalido')

System.out.println(Result)

WebUI.verifyEqual(Result, 'El correo electrónico o la contraseña ingresada no es correcta.')

WebUI.click(findTestObject('Object Repository/IniciarSesion/Validaciones/Mensaje_CampoInvalido'))

WebUI.click(findTestObject('IniciarSesion/Validaciones/Botn_Cerrar_MensajeInvalido'))