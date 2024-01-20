package Study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		//locator-----xpath--attribute,text,contains,index
		//id, name, partiallinkedtext, linked, tagname, class,cssselector 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung S20");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Galaxy S20 (Cloud Blue, 8GB RAM, 128GB Storage) Without Offer")).click();
		
		Thread.sleep(15000);
		
	    driver.findElement(By.cssSelector("input#add-to-cart-button")).click();

	}

}
