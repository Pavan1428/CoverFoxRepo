package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() {
	  
	  boolean a=true;
	  boolean b=true;

	  //Verify a is true
	  // Assert.assertTrue(a,"a value is false, TC is failed");
	  //Verify b is false
	  Assert.assertFalse(b, "b is true, TC is failed");
  }
}
