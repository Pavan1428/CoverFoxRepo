package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Remote']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@title='Sales']")).click();
		//Thread.sleep(2000);
		
		Set<String> allTabsId = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(allTabsId);
		
		for(int i=0;i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			//System.out.println(al);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		

	}

}
