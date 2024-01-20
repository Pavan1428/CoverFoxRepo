package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12_SendKeysNameUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("Teju@123");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velocity@vctcpune.com");

	}

}
