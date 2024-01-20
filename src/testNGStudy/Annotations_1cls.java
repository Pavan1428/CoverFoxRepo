package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_1cls {
 
	
	
	//BeforeTest/AfterTest BeforeSuite/ AfterSuite
	
		@Test
		public void TC1()
		{
		Reporter.log("Running TC1 ", true);
		}
		@Test
		public void TC2()
		{
		Reporter.log("Running TC2 ", true);
		}
		@BeforeMethod()
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

		@BeforeSuite
		public void beforeSuite()
		{
		Reporter.log("Before suite is running", true);
		}
		@AfterSuite
		public void afterSuite()
		{
		Reporter.log("After Suite is running", true);
		}
	
	}

