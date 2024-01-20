package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).sendKeys("Mumbai");
		
		//here two values are there in redbus from to
		//so if i have to put values in to hence used index
		//index---[]

				
				
	}
}
