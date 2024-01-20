package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		
		//1.
		WebElement dropDownField = driver.findElement(By.id("dropdown-class-example"));
		//2.
		Select s= new Select(dropDownField);
		//3
		s.selectByValue("option2");
		
		
		
		//return type void for selectby option
		
	

	}

}
