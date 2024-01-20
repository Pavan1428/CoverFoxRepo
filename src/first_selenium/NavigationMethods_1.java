package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.quit();
		//quit: to close the all the tabs present in browser opened by Selenium tool.

		
		//driver.close();
		//close: to close the current tab of the browser opened by Selenium tool.


		
		//get("");
		//quit();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//close();
		//navigate().to();
		//navigate().back();
		//navigate().forward();
		//navigate().refresh();
	}

}
