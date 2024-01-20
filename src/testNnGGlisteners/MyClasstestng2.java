package testNnGGlisteners;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

      @Listeners(testNnGGlisteners.ListenerClass.class)
      public class MyClasstestng2 {
	
	   @Test
	   public void e()
	   {
	   Reporter.log("Hi a is running", true);
	   }
	   
	   @Test
	   public void f()
	   {
	   Assert.fail();
	   Reporter.log("Hi b is running", true);
	   }
	   
	   @Test(dependsOnMethods = {"f"})
	   public void g()
	   {
	   Reporter.log("Hi c is running", true);
	   }
	   
	   @Test
	   public void h()
	   {
	   Reporter.log("Hi d is running", true);
	   }
}


