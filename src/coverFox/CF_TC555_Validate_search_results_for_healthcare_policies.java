package coverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws InterruptedException {
		
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
		memberDetails.clickOnageDropDown();
		memberDetails.membersDetailsClickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(500);
		addressDetails.enterYourPin();
		addressDetails.enterMobileNum();
		addressDetails.clickOnNextButtonAddressPage();
		
		CoverFoxHealthPlanResultsPage resultPage = new CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000);
		resultPage.validatePlanListWithResults();
		Thread.sleep(4000);
		driver.close();

	}

}
