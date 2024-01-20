package msc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitAndScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		CommonlyUsedMethod.implicitWait(driver, 2);
		CommonlyUsedMethod.takeScreenShot(driver, "Amazon Test");
		

	}

}
