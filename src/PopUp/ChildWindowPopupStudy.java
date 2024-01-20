package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		//getting text from main page
		String mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println("Main  page Text is "+mainPageElement);
		
		//clicking on new Window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		//driver.close();//Close---will close current main page
		//driver.quit();//Quit will close all tabs

		//use getWindowHandles() method to get all pages ids
		Set<String> allWindowID = driver.getWindowHandles();
		
		Iterator<String> it = allWindowID.iterator();
		
		String mainPageId = it.next();//getting ID of main page
		String childPageId = it.next();//getting ID of child
		
		System.out.println("main page id is "+mainPageId);
		
		System.out.println("Child page id is "+childPageId);
		
		
		//Switching focus from main page to child page
		driver.switchTo().window(childPageId);
		Thread.sleep(1000);
		//driver.close();//NoSuchWindowException
		driver.manage().window().maximize();//will maximize child window
		driver.findElement(By.xpath("(//input[@name='s'])[4]")).sendKeys("Good Evening");
		
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
		
		//switching focus from child page to main page
		driver.switchTo().window(mainPageId);
		Thread.sleep(1000);
		
		String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),' open link in new tab')]")).getText();
		System.out.println("main page text is "+ mainPageText2);
	}

}
