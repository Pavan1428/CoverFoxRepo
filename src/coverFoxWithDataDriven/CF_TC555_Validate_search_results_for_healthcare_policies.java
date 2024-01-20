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

public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		String ageData = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pinCodeData = mySheet.getRow(0).getCell(1).getStringCellValue();
		String mobNumData = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		
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
		memberDetails.clickOnageDropDown(ageData);
		memberDetails.membersDetailsClickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(500);
		addressDetails.enterYourPin(pinCodeData);
		addressDetails.enterMobileNum(mobNumData);
		addressDetails.clickOnNextButtonAddressPage();
		
		
		CoverFoxHealthPlanResultsPage resultPage = new CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000);
		resultPage.validatePlanListWithResults();
		Thread.sleep(4000);
		driver.close();

	}

}
