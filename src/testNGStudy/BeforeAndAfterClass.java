package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {
	
	
	 @Test
	public void TC1()
	{
	Reporter.log("TC 1 is running", true);
	}
	@Test
	public void TC2()

	{
	Reporter.log("TC 2 is running", true);
	}
	@BeforeMethod
	public void beforeMthod()
	{
	Reporter.log("Before method is running", true);
	}
	@AfterMethod
	public void afterMthod()
	{
	Reporter.log("after method is running", true);
	}
	@BeforeClass
	public void beforeClass()
	{
	Reporter.log("Open browser-->Before class", true);
	}
	@AfterClass
	public void afterClass()
	{
	Reporter.log("Close browser-->after class", true);
	}
}
