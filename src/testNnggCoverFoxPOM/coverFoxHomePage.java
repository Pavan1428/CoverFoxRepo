	package testNnggCoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverFoxHomePage {

	@FindBy (xpath ="//div[@class='w--radio__option ']") private WebElement femaleButton;
	
	public coverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFeamaleButton()
	{
		femaleButton.click();
	}

}
