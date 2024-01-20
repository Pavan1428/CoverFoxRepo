package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//handle--> hidden division pop-up
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
