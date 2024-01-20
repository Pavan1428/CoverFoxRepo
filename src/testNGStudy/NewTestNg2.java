package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNg2 {
  @Test
  public void myMethod() {
	  
	  System.out.println("HI this is printing statement");
	  Reporter.log("Hi, this is Reporter without boolean parameter");
	  Reporter.log("Hi, this is Reporter with boolean parameter", false);
	  
  }
}
