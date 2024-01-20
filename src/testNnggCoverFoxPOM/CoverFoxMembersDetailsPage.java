package testNnggCoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMembersDetailsPage {

	
	
	@FindBy(id ="Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private WebElement detailsPageNextButton;
	
	public CoverFoxMembersDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnageDropDown(String age)
	{
		//ageDropDown.click();--No need of this
		Select s = new Select(ageDropDown);
		s.selectByValue(age+"y");
		
	}
	
	public void membersDetailsClickOnNextButton()
	{
		detailsPageNextButton.click();
	}
	

}
