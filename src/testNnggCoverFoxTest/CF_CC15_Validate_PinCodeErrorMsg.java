package testNnggCoverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNnggCoverFoxBase.Base;
import testNnggCoverFoxPOM.CoverFoxAddressDetailsPage;
import testNnggCoverFoxPOM.CoverFoxHealthPlanPage;
import testNnggCoverFoxPOM.CoverFoxMembersDetailsPage;
import testNnggCoverFoxPOM.coverFoxHomePage;
import testNnggCoverFoxUtility.Utility;

public class CF_CC15_Validate_PinCodeErrorMsg extends Base {
 
	coverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxMembersDetailsPage memberDetails;
	CoverFoxAddressDetailsPage addressDetails;
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		launchCoverFox();
		home= new coverFoxHomePage(driver);
		healthPlan= new CoverFoxHealthPlanPage(driver);
		memberDetails= new CoverFoxMembersDetailsPage(driver);
		addressDetails= new CoverFoxAddressDetailsPage(driver);
	}
	
	
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.clickOnFeamaleButton();
		Thread.sleep(1000);
		healthPlan.clickOnNextButton();
		Thread.sleep(1000);
		memberDetails.clickOnageDropDown(Utility.readDataFromExcel(0, 0));
		Thread.sleep(1000);
		memberDetails.membersDetailsClickOnNextButton();
		Thread.sleep(1000);
		addressDetails.enterMobileNum(Utility.readDataFromExcel(0, 2));
		Thread.sleep(1000);
		addressDetails.clickOnNextButtonAddressPage();
	}
	
	
	@Test
  public void validate_PinCodeErrorMsg() {
		
		Reporter.log("Pin Code error msg", true);
		boolean result = addressDetails.validatepinCodeErrorMsg();
		Assert.assertTrue(result, "Pin Code Error msg not Displayed, test case is failed");
		Reporter.log("test case passed", true);
  }
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		closeCoverFox();

	}
}
