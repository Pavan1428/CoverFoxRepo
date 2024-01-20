package testNnggCoverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	
	
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement pinCodeButton;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement MobileNumButton;
	@FindBy(className = "next-btn") private WebElement nextButtonAddressPage;
	@FindBy(xpath = "//div[contains(text(),'valid pincode')]") private WebElement pinCodeErrorMsg;
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterYourPin(String pincode)
	{
		pinCodeButton.sendKeys(pincode);
	}
	
	public void enterMobileNum(String mobNum)
	{
		MobileNumButton.sendKeys(mobNum);
	}
	
	public void clickOnNextButtonAddressPage()
	{
		nextButtonAddressPage.click();
	}
	
	public boolean validatepinCodeErrorMsg()
	{
		boolean result = pinCodeErrorMsg.isDisplayed();
		return result;
	}
	
	
}
