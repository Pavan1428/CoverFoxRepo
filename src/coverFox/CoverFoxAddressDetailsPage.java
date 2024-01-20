package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	
	
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement pinCodeButton;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement MobileNumButton;
	@FindBy(className = "next-btn") private WebElement nextButtonAddressPage;
	
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterYourPin()
	{
		pinCodeButton.sendKeys("425508");
	}
	
	public void enterMobileNum()
	{
		MobileNumButton.sendKeys("9766482569");
	}
	
	public void clickOnNextButtonAddressPage()
	{
		nextButtonAddressPage.click();
	}
	
}
