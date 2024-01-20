package testNnggCoverFoxTest;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNnGGlisteners.ListenerCoverFox;
import testNnggCoverFoxBase.*;
import testNnggCoverFoxPOM.*;
import testNnggCoverFoxUtility.Utility;
import testNnggCoverFoxPOM.*;

@Listeners(testNnGGlisteners.ListenerCoverFox.class)
public class CF_TC555_Validate_search_results_for_healthcare_policies2 extends Base {

	coverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMembersDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
	
		launchCoverFox();
	home=new coverFoxHomePage(driver);
	healthPlan= new CoverFoxHealthPlanPage(driver);
	addressDetails= new CoverFoxAddressDetailsPage(driver);
	memberDetails= new CoverFoxMembersDetailsPage(driver);
	result= new CoverFoxHealthPlanResultsPage(driver);

	}
	
	@BeforeMethod
	public void enterMemeberDeatils() throws InterruptedException,
	EncryptedDocumentException, IOException
	{
	Reporter.log("clicking on gender button ", true);
	home.clickOnFeamaleButton();
	Thread.sleep(1000);
	Reporter.log("clicking on next button ", true);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Handeling age drop down ", true);
	memberDetails.clickOnageDropDown(Utility.readDataFromExcel(0, 0));
	Reporter.log("Clicking on next button ", true);
	memberDetails.membersDetailsClickOnNextButton();;
	Thread.sleep(1000);
	Reporter.log("Entering pin code ",true);
	addressDetails.enterYourPin(Utility.readDataFromExcel(0, 1));
	Reporter.log("Entering mobile num ",true);
	addressDetails.enterMobileNum(Utility.readDataFromExcel(0, 2));
	Reporter.log("Clicking on continue button ", true);
	addressDetails.clickOnNextButtonAddressPage();;
	Thread.sleep(1000);
	}

	@Test(enabled = false)
	public void validateTestPlansFromTextAndBanners() throws InterruptedException,
	IOException
	{
	Thread.sleep(5000);
	Reporter.log("Fetching number of results from text ", true);
	int textResult = result.availablePlanNumFromText();
	Thread.sleep(7000);
	Reporter.log("Fetching number of results from Banners ", true);
	int bannerResult = result.validatePlanListFromBanners();
	Thread.sleep(1000);
	Assert.assertNotEquals(textResult, bannerResult,"Text results are matching with Banner results, TC is failed");
	Reporter.log("TC is passed ", true);
	//Utility.takeScreenShot(driver, "CF_TC555");

	}
	
	@Test
	public void validatesortplansButton() {
		
		Assert.assertTrue(result.sortPlanElementPresency(),"Sort plan element is not present on webpage");
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Thread.sleep(3000);
	closeCoverFox();
	}
	
	
}
