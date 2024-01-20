package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _9_ContainsWithAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("Teju");
		
		//here u_0_b_Io this ids last value is continuously changing hence we are using attribute
		//by contains
		

	}

}
