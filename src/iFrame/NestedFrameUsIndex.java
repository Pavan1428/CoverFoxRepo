package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameUsIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(1000);

		driver.switchTo().frame(1);
		
        WebElement animalsDropDown = driver.findElement(By.id("animals"));
		
		Select s = new Select(animalsDropDown);	
		s.selectByVisibleText("Avatar");
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		//writing in text box present in outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Practice");
	    Thread.sleep(1000);
		driver.switchTo().frame(0);
		//checking check box
	    driver.findElement(By.id("a")).click();
	}

}
