package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Study 
{
  @Test
  public void login() 
  {
	  Reporter.log("Login with valid credentials",true);
  }
  @Test(priority = 1)
  public void enterdetails()
  {
	  Reporter.log("Enter all details what u have to search?",true);
  }
  
  @Test(priority = -1)
  public void launchbrowser()
  {
	  Reporter.log("Launch URL on supported browser", true);
  }
}
