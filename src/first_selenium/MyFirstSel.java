package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/");
		
        Thread.sleep(2000);
        
        //driver.manage().window().minimize();
        
        //Thread.sleep(3000);
        
        //driver.close();
        
        driver.navigate().to("https://www.facebook.com/");
        
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.navigate().forward();
        
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
        //driver.close();
        
        driver.switchTo ().newWindow(WindowType.TAB);//to open new tab
        
        driver.get("https://meet.google.com/");//to open this website in newtab
        
        Thread.sleep(2000);
        
      driver.quit();
        
        
        
        
		
		
		
		

	}

}
