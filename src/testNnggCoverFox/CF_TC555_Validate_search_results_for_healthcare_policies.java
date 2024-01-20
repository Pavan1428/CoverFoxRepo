package testNnggCoverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC555_Validate_search_results_for_healthcare_policies {
  
	//object declaration
	WebDriver driver;
	coverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMembersDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		
		//intialization
	   driver= new ChromeDriver();
	   home= new coverFoxHomePage(driver);
	   healthPlan= new CoverFoxHealthPlanPage(driver);
	   addressDetails= new CoverFoxAddressDetailsPage(driver);
	   memberDetails= new CoverFoxMembersDetailsPage(driver);
	   result= new CoverFoxHealthPlanResultsPage(driver);
	   
	   
	   Reporter.log("Opening browser ", true);
	   driver.get("https://www.coverfox.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@BeforeMethod
	public void enterMemeberDeatils() throws InterruptedException
	{
	Reporter.log("clicking on gender button ", true);
	home.clickOnFeamaleButton();
	Thread.sleep(1000);
	Reporter.log("clicking on next button ", true);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Handeling age drop down ", true);

	memberDetails.clickOnageDropDown("24");
	Reporter.log("Clicking on next button ", true);
	memberDetails.membersDetailsClickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Entering pin code ",true);
	addressDetails.enterYourPin("411046");
	Reporter.log("Entering mobile num ",true);
	addressDetails.enterMobileNum("8888888888");
	Reporter.log("Clicking on continue button ", true);
	addressDetails.clickOnNextButtonAddressPage();
	Thread.sleep(1000);
	}
	
	
	
	
	@Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException
	{
	     Thread.sleep(5000);
	     Reporter.log("Fetching number of results from text ", true);
	     int textResult = result.availablePlanNumFromText();
	     Thread.sleep(7000);
	     Reporter.log("Fetching number of results from Banners ", true);
	     int bannerResult = result.availablePlanNumFromText();
	     Thread.sleep(1000);
	     Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed");
	     Reporter.log("TC is passed ", true);

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	    Reporter.log("Closing browser ", true);
	    Thread.sleep(3000);
	    driver.close();
	}
}
