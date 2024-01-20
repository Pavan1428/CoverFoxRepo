package PracticeNew;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New1 {

	public static void main(String[] args) {
		
		
		
		WebDriver driver= new ChromeDriver();
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(getOTPButton));
		
		
		Wait<WebDriver> w2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		w1.until((ExpectedConditions.elementToBeClickable(getOTPButton)));
		

	}

}
