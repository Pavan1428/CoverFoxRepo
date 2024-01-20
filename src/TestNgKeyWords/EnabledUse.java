package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  
	
	@Test
	public void a()
	{
		Reporter.log("TC a is running", true);
	}
	
	@Test(enabled = false)
	public void b()
	{
		Reporter.log("TC b is running", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("TC c is running", true);
	}
	
	@Test
	public void d()
	{
		Reporter.log("TC d is running", true);
	}
	
}
