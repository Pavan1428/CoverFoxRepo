package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8_ContainsWithText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect' )]")).click();
		
		//xpath by contains()
		//Here we can mention the substring without writing a whole text, 
		//when link/text is long in size.
		//If any non-breakable space (nbsp) is there.


	}

}
