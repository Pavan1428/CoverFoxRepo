package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Screenshot chahiye pr uska naam kuch bhi chahiye
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//will go in temporary
		
		RandomString s = new RandomString();
		String rs = s.make(4);
		
		File Dest = new File("C:\\Users\\naikg\\Documents\\29thJuly\\ScreenShot\\myScreenShot"+rs+".png");
		
		FileHandler.copy(source, Dest);
		
		//java serial number generator/maker(Google Search)
		//java date and time maker

	}

}
