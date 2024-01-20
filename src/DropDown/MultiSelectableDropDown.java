package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement sMulti = driver.findElement(By.id("cars"));
		
		Select multiselect = new Select(sMulti);
		
		multiselect.selectByIndex(2);
		
		Thread.sleep(1000);
		
		multiselect.selectByVisibleText("Saab");
		
		Thread.sleep(1000);
		
		multiselect.selectByValue("audi");
		
		//multiselect.deselectByIndex(3);
		
		//multiselect.deselectAll();
		
		
		//Now i want to confirm kon kon select hua ya itne hi select huye hai kya confirmation then
		//System.out.println(multiselect.getAllSelectedOptions().getText());
		
		//getFirstSelectedOption will give only one value---return type is webelement
		//getAllSelectedOptions will give list ----hence return type is list of web element
		System.out.println(multiselect.getFirstSelectedOption().getText());
		
		
		//how many options are present in dropdown
		//List<WebElement> options = multiselect.getOptions();
		
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
				
		//Now i want to confirm kon kon select hua ya itne hi select huye hai kya confirmation then		
		List<WebElement> sel = multiselect.getAllSelectedOptions();
		
		for(WebElement o:sel)
		{
			System.out.println(o.getText());
		}
		

	}

}
