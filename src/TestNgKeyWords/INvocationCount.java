package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class INvocationCount {
  
	
	@Test
	public void a()
	{
		Reporter.log("Test case a is running", true);
	}
	
	@Test(invocationCount = 4)
	public void b()
	{
		Reporter.log("Test case  b is running", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("Test case c is running", true);
	}
	
	
}
