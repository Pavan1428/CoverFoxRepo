package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixedKeyWords {
  
	@Test(priority = -1,dependsOnMethods = {"d"})
	public void a()
	{
	Reporter.log("TC a is running", true);
	}
	@Test
	public void b()
	{
	Reporter.log("TC b is running", true);
	}
	@Test
	public void c()
	{
	Reporter.log("TC c is running", true);
	}
	@Test(invocationCount = 3)
	public void d()
	{
	Reporter.log("TC d is running", true);
	}
	
	
}
