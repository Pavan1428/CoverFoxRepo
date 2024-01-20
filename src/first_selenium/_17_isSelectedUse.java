package first_selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_isSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains (@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		//boolean result = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		//System.out.println("Gender selection status is "+result);
		
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//boolean result1 = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		//System.out.println("Gender selection status is "+result1);
		
		//code optimization
		WebElement maleGender= driver.findElement(By.xpath("//input[@value='2']"));
		boolean result = maleGender.isSelected();
		System.out.println("Gender selection status is "+result);
		maleGender.click();
		boolean result1 = maleGender.isSelected();
		System.out.println("Gender selection status is "+result1);
				

	}

}
