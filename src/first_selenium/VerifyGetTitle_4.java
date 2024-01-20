package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGetTitle_4 {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedResult = "Google";
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		String actualResult =driver.getTitle();
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("title is matching, test case is passed");
		}
		else
			System.out.println("title is not matching, test case is failed");
		
	}

}
