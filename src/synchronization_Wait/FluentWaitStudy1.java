package synchronization_Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitStudy1 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		Wait<WebDriver> w= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		//.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		w.until(ExpectedConditions.elementToBeClickable(getOTPButton));
		getOTPButton.click();

	}

}
