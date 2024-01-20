package testNnGGlisteners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener
{
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
	String TCName = result.getName();
	Reporter.log("TC " +TCName+" is completed successfully", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{

	String TCName=result.getName();

	Reporter.log("TC "+TCName+" is skipped, please check dependent", true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{

	Reporter.log("TC " +result.getName()+" is failed, please check again",true);
	}
	@Override
	public void onTestStart(ITestResult result)
	{

	Reporter.log("TC "+result.getName()+" execution is started", true);

	}
	
	
	

}
