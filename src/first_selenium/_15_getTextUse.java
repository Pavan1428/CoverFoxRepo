package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_getTextUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		String expectedResult ="Find your dream job now";
		String actualResult =driver.findElement(By.className("qsb-title")).getText();
		System.out.println(actualResult);
		// WebElement myElement = driver.findElement(By.className("qsb-title"));
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Text is matching, TestCase is passed");
		}
		else
		{
			System.out.println("Text is not matching, test case is fail");
		}
		
	}

}
