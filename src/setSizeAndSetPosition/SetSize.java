package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		

		//If I want to change size of browser/tab
		//now get default size for that
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		
		//Now I want to set my size
		//so need to create obj of dimension
		
		Dimension d= new Dimension(90, 1000);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		
	}

}
