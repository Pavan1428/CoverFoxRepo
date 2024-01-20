package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL_5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		String url= driver.getCurrentUrl();// this method is use to get URL of a webpage. 
		//return type of getCurrentURL method is String

		System.out.println("url is---> "+ url);
		
	    Thread.sleep(2000);
	    
	    String expectedurl="https://www.instagram.com/";
	    
	    String actualurl =driver.getCurrentUrl();
	    
	    if(expectedurl.equals(actualurl))
	    {
	    	System.out.println("url is correct. test case is passed");
	    }
	    else
	    	System.out.println("url is diff, test case is failed");
	    

	}

}
