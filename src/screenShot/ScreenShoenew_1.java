package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import first_selenium.MyFirstSel;

public class ScreenShoenew_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//type cast karna means uska type change karna-->explicit--double d =999.8d====ind d = (int)e;
		//now driver ko convert karna hai takescreenshot maii((takeScreenShot)driver)because driver ka
		//webdriver hai//covert eshliye kiya getscreenshotas ye method Takescreenshot ki haii
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bcci.tv/");
		Thread.sleep(1000);
		
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//image is in file type
		//output--interface hai  //file--static and final method
		System.out.println(myfile);//it will take file in temporary location
		
		//for desired location
		
		File myFile1 = new File("C:\\Users\\naikg\\Documents\\29thJuly\\ScreenShot\\myScreenShot.png");
		//here myScreenShot name given by me
		
		//copyPaste//use filehandler selenium//myFile(source)//myFile1(dest)
		
		FileHandler.copy(myfile, myFile1);
		//at a time it will show only one screenshot by changing its time
		//for that RandomMakerMethod
		
				

	}

}
