package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _18_isDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		//because i clicked on hide its disappear
		boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
		
		System.out.println(result);
		
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		
		boolean result1 = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println(result1);

	}

}
