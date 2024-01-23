package suiteLevel_Listener;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(suiteLevel_Listener.Listener1_Class.class)
public class Class2 {
  
  @Test
  public void d() throws InterruptedException
  {
	  Reporter.log("Hi d is running", true);
	   
  }
  @Test
  public void e()
  {
	  Assert.fail();
	  Reporter.log("Hi e is running", true);
  }
  @Test(dependsOnMethods = "b")
  public void f()
  {
	  
	  Reporter.log("Hi f is running", true);
  }
  @Test
  public void g() 
  {
	  Reporter.log("Hi g is running", true);
  }
  
}
