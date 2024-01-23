package coverFoxTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import coverFoxBase.Base;
import coverFoxUtility.Utility;

public class CoverFoxListener extends Base implements ITestListener  {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			Utility.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
