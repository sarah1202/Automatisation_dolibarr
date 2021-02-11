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

<<<<<<< HEAD:dolibarr_auto/Scripts/PROJET_SERVICE/PS-001-A1 - delete service/Script1612964933659.groovy
WebUI.verifyElementPresent(findTestObject('PS-001-N/Page_Accueil - Dolibarr 1300/span_Projets'), 0)
=======
WebUI.callTestCase(findTestCase('Special/Connexion'), [('Login') : 'admin', ('Password') : 'pass'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PS-001-N/Page_Accueil - Dolibarr 1300/span_Projets'), 1, FailureHandling.OPTIONAL)
>>>>>>> d4f891b3641c1fdf1b7ca02049052952b1dc4317:dolibarr_auto/Scripts/PROJET_SERVICE/PS-001-A1 - delete project/Script1612965169559.groovy

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Accueil - Dolibarr 1300/span_Projets'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/a_Liste'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Projets/a_Liste'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/span_PJ2102-0001_fas fa-sitemap infobox-pro_024f19'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Projets/span_PJ2102-0001_fas fa-sitemap infobox-pro_024f19'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/a_Supprimer'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/a_Supprimer'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/div_tes-vous sr de vouloir supprimer ce projet'), 
    1, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/button_Oui'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/button_Oui'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/span_(0)'), 1, FailureHandling.OPTIONAL)
