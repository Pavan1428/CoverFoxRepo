package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabaaddToCartPage {

	//1.variables
	
	@FindBy(id = "shopping_cart_container") private WebElement cartButton;
	@FindBy(id ="add-to-cart-sauce-labs-backpack") private WebElement tShirtAddToCartButton;
	@FindBy(name = "add-to-cart-sauce-labs-bike-light") private WebElement jacketAddToCartButton;
	
	//2.constructor
	
	public SwagLabaaddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void tShirtAddToCart()
	{
		tShirtAddToCartButton.click();
	}
	
	public void jacketAddToCart()
	{
		jacketAddToCartButton.click();
	}
	
	public void clickOnCartButton() 
	{
		cartButton.click();
	}

}
