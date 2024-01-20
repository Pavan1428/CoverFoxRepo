package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		//Frame ke andar Frame
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//if there is no name and id present then use index an webelement
		//focusing main page to outer frame
		driver.switchTo().frame(2);//outer frame
		
		driver.switchTo().frame(15);//inner frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inner Frame Example");
		
		//noSuchFrameException
		

	}

}
