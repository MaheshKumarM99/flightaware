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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.flightaware.com/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Menu/Industries'))

WebUI.click(findTestObject('Object Repository/Menu/Airlines'))

WebUI.click(findTestObject('Object Repository/Menu/Contact Us'))

WebUI.setText(findTestObject('Object Repository/Contact Us/First Name'), 'First')

WebUI.setText(findTestObject('Object Repository/Contact Us/Last Name'), 'Last')

WebUI.setText(findTestObject('Object Repository/Contact Us/Company Name'), 'Company')

WebUI.setText(findTestObject('Object Repository/Contact Us/Email'), 'tester@gmail.com')

WebUI.setText(findTestObject('Object Repository/Contact Us/Phone'), '9988776655')

WebUI.setText(findTestObject('Object Repository/Contact Us/Tell Us'), 'jsdhmjHJcajscj jdsajesejf jaaeduaed ')

WebUI.click(findTestObject('Object Repository/Contact Us/Submit'))

