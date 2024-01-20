package DropDown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class SelectDropDown2linktextpartial {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		//locator-->link text
		//driver.findElement(By.linkText("Create new account")).click();
		//partiallinkText
		driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(1000);
		//How to handle drop down
		
		//selecting Date
		//1. Identify list box to be handled and store it in reference variable
		WebElement date = driver.findElement(By.id("day"));
		// 2. Create an object of Select class which will accept WebElement as argument
		Select sDate = new Select(date);
		// 3. By using one of the select class methods we can select values form list box like
		//sDate.selectByIndex(6);
		//sDate.selectByValue("10");
		sDate.selectByVisibleText("13");
		
		//selecting Month
		WebElement month = driver.findElement(By.id("month"));
		
		Select sMonth = new Select(month);
		
		sMonth.selectByIndex(5);
		
		
		//selecting Year
		WebElement year =driver.findElement(By.name("birthday_year"));
		
		Select sYear = new Select(year);
		
		sYear.selectByValue("2021");
		
		//to verify dropDown/List box is multiple select-able or not
		
		boolean result = sYear.isMultiple();
		System.out.println("The result is "+result);
		
		
		//getOptions
		System.out.println("====================for each====================");
		List<WebElement> options = sDate.getOptions();
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		System.out.println("===========Iterator=============");
		
		Iterator<WebElement> itd = options.iterator();
		
		while(itd.hasNext())
		{
			System.out.println(itd.next().getText());
		}
				
		
		System.out.println("===========List-Iterator=============");
		
		ListIterator<WebElement> ltd = options.listIterator();
		
		while(ltd.hasNext())
		{
			System.out.println(ltd.next().getText());
		}
		
		System.out.println("============for loop============");
		
		for(int i=0; i<=options.size()-1;i++)
		{
			System.out.println(options.get(i).getText());
		}

	}

}
