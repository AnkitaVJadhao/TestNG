package listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Class implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC " +TCName+" execution is started", true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC " +TCName+" is completed successfully", true);		
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC " +TCName+" is skipped, please check dependent method", true);	
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC " +TCName+"is failed, please check again", true);	
	}
	
}
