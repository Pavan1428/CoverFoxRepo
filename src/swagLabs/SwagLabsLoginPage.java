package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {

	//1.variables
	@FindBy(id = "user-name") private WebElement usernameField;
	@FindBy(name = "password") private WebElement passwordField;
	@FindBy(id = "login-button") private WebElement loginButton;
	
	
	//2.Constructor
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.Methods
	
	public void enterUserName()
	{
		usernameField.sendKeys("standard_user");
	}
	
	public void enterPassword()
	{
		passwordField.sendKeys("secret_sauce");
	}
	
	public void clickOnLogginButton()
	{
		loginButton.click();
	}

}
