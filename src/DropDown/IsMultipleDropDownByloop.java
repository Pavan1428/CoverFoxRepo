package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDropDownByloop {

	public static void main(String[] args) throws InterruptedException {
		//interface ka object reference class ka
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement sMulti = driver.findElement(By.id("cars"));
		
		Select se = new Select(sMulti);
		
		//If I want to check Drop down is multiselectable or not
		
		System.out.println(se.isMultiple());
		
		//now if it will show true value then If i want check how many options are there
		//for one option we call--element=====for multiple--elements
		//findElement=== find outs only one value---return type webelement
		//findElements===find outs multiple values---return type listofwebelements
		//both methods are webDrivers Method
		//WebDriver works on browser
		
		//jab bhi multiple elements dikhte hai tb go with find elements method
		
		
		//interface ka object reference class ka //upcasting
		
		List<WebElement> allCars = driver.findElements(By.xpath("//select[@id='cars']"));
		//System.out.println(allCars);//it will show u list of webelements
		
		//for list of elements---for text
		
		//now list mein ghumne ke liye//traversing karne ke liye
		
		for(WebElement ac:allCars)
		{
			System.out.println(ac.getText());
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		//now if i want 
	}

}
