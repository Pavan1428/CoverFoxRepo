package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 {
  
	
	@Test(groups = "Regression")
	public void Tc1()
	{
	Reporter.log("TC 1 is running", true);
	}
	@Test(groups = "Regression")
	public void Tc2()
	{
	Reporter.log("TC 2 is running", true);
	}
	@Test(groups = "Regression")
	public void Tc3()
	{
	Reporter.log("TC 3 is running", true);
	}
	@Test(groups = "Sanity")
	public void Tc4()
	{
	Reporter.log("TC 4 is running", true);
	}
}
