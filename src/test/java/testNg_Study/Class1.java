package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
  @Test
  public void method1() 
  {
	  Reporter.log("Hii, welcome to method1",true);
  }
  @BeforeMethod()
  public void beforemethod()
  {
	  Reporter.log("Hii, welcome to beforemethod",true);
  }
  @AfterMethod()
  public void aftermethod()
  {
	  Reporter.log("Hii, welcome to aftermethod", true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Hii, welcome to beforeclass",true);
  }
  @AfterClass()
  public void afterclass()
  {
	  Reporter.log("Hii, welcome to afterclass", true);
  }
  @BeforeTest()
  public void beforetest()
  {
	  Reporter.log("Hii, welcome to beforetest", true);
  }
  @AfterTest()
  public void aftertest()
  {
	  Reporter.log("Hii, welcome to aftertest", true);
  }
  
}
