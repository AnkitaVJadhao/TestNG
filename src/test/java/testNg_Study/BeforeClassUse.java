package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
  @Test
  public void method1()
  {
	  
	  Reporter.log("Hii method1",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("Hii method2",true);
  }
  @BeforeClass
  public void class1()
  {
	  Reporter.log("Welcome to class",true);
  }
  @BeforeMethod
  public void main()
  {
	  Reporter.log("Logging successfully",true);
  }
  @AfterMethod
  public void last()
  {
	  Reporter.log("Logged out",true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("Visit back....Thank You!",true);
  }
}
