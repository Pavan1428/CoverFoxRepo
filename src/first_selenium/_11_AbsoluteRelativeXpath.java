package first_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_AbsoluteRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		//absolutexpath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/p[1]")).click();
		
		//relativexpath
		//driver.findElement(By.xpath("(//div/p[1])[1]"));
		

	}

}
