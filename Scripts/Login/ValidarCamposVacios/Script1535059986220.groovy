import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ById as ById
import org.testng.Assert
import org.openqa.selenium.WebDriver

WebDriver driver = DriverFactory.getWebDriver();

WebUI.click(findTestObject("Login/input_btn"), FailureHandling.STOP_ON_FAILURE)
//hola hola
String ms1 = "El campo correo electrónico es obligatorio."
String ms2 = "El campo contraseña es obligatorio."
WebUI.verifyMatch(ms1, driver.findElement(By.xpath("//ul/li[1]")).getText(), true, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyMatch(ms2, driver.findElement(By.xpath("//ul/li[2]")).getText(), true, FailureHandling.CONTINUE_ON_FAILURE)


