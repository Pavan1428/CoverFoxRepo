package Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int noOFRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		int noOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		
		
		for(int i=1; i<=noOfColumns;i++)
		{
			String data = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr[1]/th["+i+"]")).getText();
			System.out.print(data+" !! ");
			
		}
		System.out.println();
		
		for(int i=1; i<=noOFRows-1;i++)
		{
			for(int j=1; j<=noOfColumns; j++)
			{
				String data = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" !! ");
				
				
			}
			System.out.println();
		}
		
		
		
	
	}

}
