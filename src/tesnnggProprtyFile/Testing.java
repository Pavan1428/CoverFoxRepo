package tesnnggProprtyFile;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	
	public static void main(String[] args) throws IOException
	{
	 
		String value1 =commonlyUsedMethod.readDataFromPropertyFile("age");

	    System.out.println(value1);
	    String value2 =commonlyUsedMethod.readDataFromPropertyFile("pinCode");

	    System.out.println(value2);

	    System.out.println(commonlyUsedMethod.readDataFromPropertyFile("MobNum"));
	    
	}
}
