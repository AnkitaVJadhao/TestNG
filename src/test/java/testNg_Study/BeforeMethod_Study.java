package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_Study {
  @Test
  public void method1()
  {
	  System.out.println("Hi method1");
	  //Reporter.log("Hi method1",true);
  }
  
  @Test
  public void method2()
  {
	  System.out.println("Hi method2");
	  //Reporter.log("Hi method2",true);
  }
  
  @BeforeMethod()
  public void main()
  {
	  System.out.println("Logging successfully");
	  //Reporter.log("Logging successfully",true);
  }
  
  @AfterMethod()
  public void last()
  {
	  System.out.println("Logged out");
	  //Reporter.log("Logged out",true);
  }
}
