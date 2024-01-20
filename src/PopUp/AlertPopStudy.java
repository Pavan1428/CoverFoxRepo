package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		
		//Handling alert popup
		
		Alert alt = driver.switchTo().alert();
		
		//if i want to click on OK button on alert
		Thread.sleep(1000);
		alt.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("12345");
		
	}

}
