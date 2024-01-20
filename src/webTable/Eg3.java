package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int noOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		
		System.out.println("==========================================================");
		
		for(int i=1; i<=noOfRows; i++)//Outer--->rows-->1--7
		{
			for (int j=1; j<=noOfColumns; j++)//inner--->colums--->1-->4
			{
				if(i==1)
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					System.out.print(data.getText()+" ");
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
				}
		
			}
			System.out.println();
			System.out.println("=================================================================");
		

	}

}
}
