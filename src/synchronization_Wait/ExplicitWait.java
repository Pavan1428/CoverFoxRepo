package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?fow=OTPLogin");
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//webdriver wait ka object
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(500));
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		w.until(ExpectedConditions.elementToBeClickable(getOTPButton));
		getOTPButton.click();
		
		
		
		

	}

}
