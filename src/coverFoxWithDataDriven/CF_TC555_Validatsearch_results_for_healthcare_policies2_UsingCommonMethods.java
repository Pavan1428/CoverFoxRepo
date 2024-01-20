package coverFoxWithDataDriven;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import msc.CommonlyUsedMethod;



public class CF_TC555_Validatsearch_results_for_healthcare_policies2_UsingCommonMethods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
        ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-disable-notifications");


		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		coverFoxHomePage home = new coverFoxHomePage(driver);
		Thread.sleep(500);
		home.clickOnFeamaleButton();
		
		CoverFoxHealthPlanPage healthPlan = new CoverFoxHealthPlanPage(driver);
		Thread.sleep(500);
		healthPlan.clickOnNextButton();
		
		CoverFoxMembersDetailsPage memberDetails = new CoverFoxMembersDetailsPage(driver);
		Thread.sleep(500);
		memberDetails.clickOnageDropDown(CommonlyUsedMethod.readDataFromExcel(7, 0));
		memberDetails.membersDetailsClickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(500);
		addressDetails.enterYourPin(CommonlyUsedMethod.readDataFromExcel(7, 1));
		addressDetails.enterMobileNum(CommonlyUsedMethod.readDataFromExcel(7, 2));
		addressDetails.clickOnNextButtonAddressPage();
		
		
		CoverFoxHealthPlanResultsPage resultPage = new CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000);
		resultPage.validatePlanListWithResults();
		Thread.sleep(4000);
		driver.close();

		


	}

}
