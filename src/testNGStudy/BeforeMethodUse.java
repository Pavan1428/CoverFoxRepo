package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodUse {
  
	@Test
    public void myMethod1() 
	{
	  Reporter.log("TC myMethod1 is running", true);
	}
	
	@Test
	public void myMethod2()
	{
	Reporter.log("TC myMethod2 is running", true);
	}
	@BeforeMethod
	public void login()
	{
	Reporter.log("Login is done", true);
	}

	@AfterMethod
	public void logOut()
	{
	Reporter.log("LogOut is done", true);
	}
}
