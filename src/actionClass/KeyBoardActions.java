package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//Now we will use upward downward key for date after that enter
		//dropdown by using action class not select
		//go down and enter
		//jahape action karni wahape locator find out karna hai
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act = new Actions(driver);
		//if you are using action class multiple method then at the end you have to add.build.perform
		//agar keyboard ki keys use karni hai toh sendkeys hi use karna pdega
		//act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		//agar bohot baar upper ya niche karna hai
		
//		act.click(day).perform();
//		for(int i=0; i<=20;i++)
//		{
//			act.sendKeys(Keys.ARROW_UP).perform();
//			Thread.sleep(1000);
//		}
//		act.sendKeys(Keys.ENTER).perform();
		
		//If I want to write in captital letter 
		
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		act.sendKeys(firstNameField, "VELOCITY").perform();
		
		//likh esse rahi hu "velocity" but aana capital mai chahiye
		//keydown----key press karke rakhni hai --then kahape krna hai bracket main
		//act.keyDown(firstNameField, Keys.SHIFT).sendKeys("velocity").build().perform();
		
		act.keyDown(firstNameField, Keys.SHIFT).sendKeys("v").keyUp(firstNameField, Keys.SHIFT).sendKeys("locity").perform();
		
		
		

	}

}
