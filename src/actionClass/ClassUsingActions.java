package actionClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClassUsingActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//button[@name='login']"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		//Create an object of an Action class which will accept diver object as apartment
		
		Actions act = new Actions(driver);
		
		//Using one of the Actions class method perform an action
		
		//act.moveToElement(loginButton).perform();
		//act.click().perform();
		
		
		//act.moveToElement(loginButton).click().build().perform();
		
		act.click(loginButton).perform();
		
		
    
	}

}
