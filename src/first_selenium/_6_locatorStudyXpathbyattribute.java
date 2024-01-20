package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_locatorStudyXpathbyattribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("teju");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Search']")).click();
		

}
}
