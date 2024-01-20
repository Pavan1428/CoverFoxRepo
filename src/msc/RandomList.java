package msc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList {

	public static void main(String[] args) throws InterruptedException {
		
		
		//If I put option honda on google it will show me diff random options regarding honda
		//and I have to select one and have to click on option
		//searchbox ka almost name q hota hai 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		//ul---->unorderedList,  li----->List Items
		//I need 10 options list---hence used listofwebElements
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		for(WebElement se:searchResult)
		{
			System.out.println(se.getText());
		}

		//Now If I want to select only one option
		
		System.out.println("==================================");
		
		String expResult = "honda elevate";
		
		for(WebElement sr1:searchResult)
		{
			String actResult = sr1.getText();
			
			if(actResult.equals(expResult))
			{
				sr1.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	}

}
