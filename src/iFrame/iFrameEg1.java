package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Frames.html");
		/*String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		//System.out.println("Text is--->"+myTest);//noSuchWlementException
		//exception beacause aapka text frame pr haii//main page ke andar iframe hai uske upper text hai
		
		//iFrame ko id hai kya ya name hai kya*/

		
		//switching focus from main page to IFrame
		driver.switchTo().frame("singleframe");//frame ko name dedo ya id dedo
		String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("Text is--->"+myTest);
		Thread.sleep(1000);
		//have to switch to main frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		WebElement button2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		System.out.println("Display Status for button 2-->> "+button2.isDisplayed());//true false
		
	}

}
