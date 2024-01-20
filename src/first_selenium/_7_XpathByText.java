package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7_XpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Find your dream job now']")).click();
		
		driver.findElement(By.xpath("//div[text()='Search']")).click();
	}

	
}
