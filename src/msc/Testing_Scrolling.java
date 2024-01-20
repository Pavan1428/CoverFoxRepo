package msc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Scrolling {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
		driver.manage().window().maximize();
		CommonlyUsedMethod.implicitWait(driver, 3);
		WebElement termsAndCondition = driver.findElement(By.xpath("//span[text()='Terms and conditions']"));
		CommonlyUsedMethod.scrollIntoView(driver, termsAndCondition);
		CommonlyUsedMethod.takeScreenShot(driver, "ghj");
		

	}

}
