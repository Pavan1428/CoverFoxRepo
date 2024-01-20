package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//CSS selectors
		//Tag and ID-->css=tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("Teju@123");
		Thread.sleep(1000);
		
		//Tag and Attribute -->css=tag[attribute=value]
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12356");
		
		
		//Tag and Class -->css=tag.class
		driver.findElement(By.cssSelector("div._6ltj")).click();
		Thread.sleep(1000);
		
		
	}

}
