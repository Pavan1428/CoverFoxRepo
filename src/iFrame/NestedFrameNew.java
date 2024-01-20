package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameNew {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(1000);
		String mainPageString = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
		
		System.out.println("Text on main page is --> "+mainPageString);
		
		driver.switchTo().frame("frame1");//switching selenium focus from main page to outer frame
		Thread.sleep(1000);
		//writing in text box present in outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Practice");
		Thread.sleep(1000);
		
		//switching selenium focus main page to inner frame
		driver.switchTo().frame("frame3");
		Thread.sleep(1000);
		//checking check box
		driver.findElement(By.id("a")).click();
		
		//clearing text box of outer frame
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(1000);
		
		//want to handle dropdown of another frame
		//focusing selenium main outer frame to main page-----and main page to another frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		
		WebElement animalsDropDown = driver.findElement(By.id("animals"));
		
		Select s = new Select(animalsDropDown);	
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		String mainPageText1 = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
		
		System.out.println(mainPageText1);
	}

}
