package Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		int noOfColums = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		
		System.out.println(noOfRows);
		System.out.println(noOfColums);
		
		
		for(int i=1; i<=noOfRows;i++)
		{
			for(int j=1; j<=noOfColums;j++)
			{
				if(i==1)
				{
					String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(data+" ");
				}
				else
				{
					String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
				}
			}
			System.out.println();
		}

	}
	
	

}
