package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f() {
	  
	  String a="Hi";
	  String b=null;

	  // Verify a is not null

	  // Assert.assertNotNull(a, "a value is null. TC is failed");
	  //Verify b is null
	  //Assert.fail();
	  Assert.assertNull(b, "b value is not null, TC is failed");
  }
}
