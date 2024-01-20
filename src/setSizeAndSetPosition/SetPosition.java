package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		//if I want to get default position of point
		//so we can change position of browser/tab/application
		
		
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println(defaultPosition);
		
		
		//Now I want to set my position
		//so need to create obj of point
		Point p = new Point(280, 100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		Point p1= new Point(-280, 100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);

	}

}
