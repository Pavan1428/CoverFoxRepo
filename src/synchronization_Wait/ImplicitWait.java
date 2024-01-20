package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/");
		//Thread.sleep(1000);//15s
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//5s
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

}
