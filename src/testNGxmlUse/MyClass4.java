package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass4 {
  
	
	@Test(groups = "Sanity")
	public void Tc5()
	{
	Reporter.log("TC 5 is running", true);
	}
	@Test(groups = {"Sanity","Regression"})
	public void Tc6()
	{
	Reporter.log("TC 6 is running", true);
	}
	@Test(groups = "Regression")
	public void Tc7()
	{

	Reporter.log("TC 7 is running", true);
	}
	@Test(groups = "Sanity")
	public void Tc8()
	{
	Reporter.log("TC 8 is running", true);
	}
}
