package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestStudy {
  @Test
  public void method1()
  {
	  Reporter.log("Hii,it's method1",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("Hii, it's method2",true);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("Hii, it's beforemethod",true);
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("Hii, it's aftermethod",true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Hii , it's beforeclass",true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("Hii, it's afterclass",true);
  }
  @BeforeTest
  public void beforetest()
  {
	  Reporter.log("Hii, it's beforetest",true);
  }
  @AfterTest
  public void aftertest()
  {
	 Reporter.log("Hi , it's aftertest",true); 
  }
  
  
}
