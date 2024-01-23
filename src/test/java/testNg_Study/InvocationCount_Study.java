package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_Study
{
  @Test(priority = -1)
  public void entercredentials()
  {
	  Reporter.log("Enter valid credentails ", true);
  }
  @Test(invocationCount = 3,priority = 0)
  public void verfiycaptcha()
  {
	  Reporter.log("Correct!",true);
  }
  @Test(priority = 1)
  public void homepage()
  {
	  Reporter.log("User navigate to homepage after entering valid credentials and captcha",true);
  }
}
