package swagLabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user_name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login_button = driver.findElement(By.id("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login_button.click();
		
		WebElement backpack = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		//WebElement bike_light = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
		
		backpack.click();
		//bike_light.click();
		
		WebElement cartButton = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		cartButton.click();
		
		List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		//to get the how many items added into the cart
		System.out.println("Number of cart items are "+cartItems.size());
		//to get which items added into the cart
		for(WebElement ci:cartItems)
		{
			System.out.println(ci.getText());
		}
		
		//to validate items is same as what we want
		
		Iterator<WebElement> it = cartItems.iterator();
		WebElement itemNo1 = it.next();
		//WebElement itemNo2 = it.next();
		
		if(itemNo1.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("Selected item is corrected as---->Sauce Labs Backpack");
			//checkout
			driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
			
		}
		else
		{
			System.out.println("Selected item is not correct");
		}
		
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		
		firstName.sendKeys("velocity");
		lastName.sendKeys("Pune");
		zipCode.sendKeys("411098");
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		continueButton.click();
		
		WebElement finish = driver.findElement(By.linkText("FINISH"));
		finish.click();
		
		WebElement thankYoumsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
		
		if(thankYoumsg.getText().equals("THANK YOU FOR YOUR ORDER"))
		{
			System.out.println("Thank You Msg Displayed.......logging out");
			driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
			
		}
		else
		{
			System.out.println("Thank you msg not displayed.....please check");
		}



	}

}
