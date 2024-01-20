package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_2cls {
  
	
		@Test
		public void TC3()
		{
		Reporter.log("Running TC3 ", true);
		}
		@Test
		public void TC4()
		{
		Reporter.log("Running TC4 ", true);
		}
		@BeforeMethod
		public void beforeMethod()
		{
		Reporter.log("Before method is runnig", true);
		}
		@AfterMethod
		public void afterMethod()
		{
		Reporter.log("afterMethod method is runnig", true);

		}
		@BeforeClass
		public void beforeClass()
		{
		Reporter.log("Before class is runing", true);
		}
		@AfterClass
		public void afterClass()
		{
		Reporter.log("afterClass class is runing", true);
		}
		@BeforeTest
		public void beforeTest()
		{
		Reporter.log("Before test is running", true);
		}
		
		@AfterTest
		public void afterTest()
		{
		Reporter.log("after test is running", true);
		}
	
	
	
	}
