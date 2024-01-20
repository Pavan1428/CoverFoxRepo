package chromeOptionsUse;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsStudy {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		//If i dont want to open browser but I want to see result(getTitle)==headless
		//opt.addArguments("--headless");
		//opt.addArguments("incognito");
		//opt.addArguments("-disable-notifications");
		//opt.addArguments("start-maximized");//default maximized
		
		//for all options Use
		ArrayList<String> al = new ArrayList<>();
		al.add("incognito");
		al.add("-disable-notifications");
		al.add("start-maximized");
		
		opt.addArguments(al);
		
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		

	}

}
