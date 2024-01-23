package suiteLevel_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(suiteLevel_Listener.Listener1_Class.class)

public class Class1 {
  @Test
  public void a() {
	  Reporter.log("Hi a is running",true);
	  
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
  public void d()
  {
	  Reporter.log("Hi d is running", true);
  }
}
