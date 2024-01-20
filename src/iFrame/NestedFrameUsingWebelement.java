package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameUsingWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//input[@type='text']")));//switching selenium focus from main page to outer frame
		Thread.sleep(1000);
		//writing in text box present in outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Practice");
		
		//it will not work for all websites

	}

}
