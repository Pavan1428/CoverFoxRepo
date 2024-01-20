package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse_3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();// this method is use to get title of a webpage. 
		//return type of getTitle method is String.

		
		System.out.println("title is "+ title);
		

	}

}
