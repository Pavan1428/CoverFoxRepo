package msc;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromExcelNaukriRegForm {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=11496&wExp=N");
		driver.manage().window().maximize();
		CommonlyUsedMethod.implicitWait(driver, 5);
		
		WebElement fullName = driver.findElement(By.id("name"));
		WebElement emailID = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement mobile = driver.findElement(By.id("mobile"));
		
		
		// fullName.sendKeys("Yogendra Joshi");
		// emailID.sendKeys("yjoshi@gmail.com");
		// password.sendKeys("1234");
		// mobile.sendKeys("9421357890");
		
		fullName.sendKeys(CommonlyUsedMethod.readDataFromExcel(4, 0));
		emailID.sendKeys(CommonlyUsedMethod.readDataFromExcel(4, 1));
		password.sendKeys(CommonlyUsedMethod.readDataFromExcel(4, 2));
		mobile.sendKeys(CommonlyUsedMethod.readDataFromExcel(4, 3));
		
		
		

	}

}
