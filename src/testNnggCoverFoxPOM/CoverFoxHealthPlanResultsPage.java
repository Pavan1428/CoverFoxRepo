package testNnggCoverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlanResultsPage {
	
	
	
	@FindBy(xpath = "//div[contains(text(),'49 matching Health')]") private WebElement resultInString;
	@FindBy(xpath = "//div[@class='plan-card-container']") private List<WebElement> planList;
	@FindBy(xpath = "//div[text()='Sort Plans']") private WebElement sortPlansField;
	
	
	
	
	public CoverFoxHealthPlanResultsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	
	//It will give 49 int value
	public int availablePlanNumFromText()
	{
		String test = resultInString.getText();
		//49 matching Health Insurance Plans
		
		String ar[]=test.split(" ");
		//ar[]={"49","matching,""Health","insurance","plan"}
		
		String numberOfResultsInString = ar[0];//--->sTRING
		
		
		//convert String to integer
		int numberOfResultsInInt = Integer.parseInt(numberOfResultsInString);//49-->in number(int)
		return numberOfResultsInInt;
	}
	
	public int validatePlanListFromBanners()
	{
		
		int totalNumberOfPlans = planList.size();
		return totalNumberOfPlans;
	}
	

	public boolean sortPlanElementPresency()
	{
		Reporter.log("VAlidatingSortPlanElementPresency", true);
		boolean value = sortPlansField.isDisplayed();
		return value;
	}
}
