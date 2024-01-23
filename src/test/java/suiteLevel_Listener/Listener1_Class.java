package suiteLevel_Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1_Class implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC "+TCName+"is completed successfully",true);
		
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC "+TCName+"started execution",true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC "+TCName+"skipped execution",true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String TCName=result.getName();
		Reporter.log("TC "+TCName+"Failed the execution",true);
	}
}
