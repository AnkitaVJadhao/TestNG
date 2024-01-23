package listener_Study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener_Study.Listener_Class.class)
public class MyClass_1 {
  
  @Test
  public void a() throws InterruptedException
  {
	  Reporter.log("Hi a is running", true);
	   
  }
  @Test
  public void b()
  {
	  Assert.fail();
	  Reporter.log("Hi b is running", true);
  }
  @Test(dependsOnMethods = "b")
  public void c()
  {
	  
	  Reporter.log("Hi c is running", true);
  }
  @Test
  public void d() throws InterruptedException
  {
	  Reporter.log("Hi d is running", true);
  }
  
}
