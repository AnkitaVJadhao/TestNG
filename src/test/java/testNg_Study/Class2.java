package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	  public void method2() 
	  {
		  Reporter.log("Hii, welcome to method2",true);
	  }
	  @BeforeMethod()
	  public void beforemethod()
	  {
		  Reporter.log("Hii, welcome to beforemethod from class2",true);
	  }
	  @AfterMethod()
	  public void aftermethod()
	  {
		  Reporter.log("Hii, welcome to aftermethod from class2", true);
	  }
	  @BeforeClass
	  public void beforeclass()
	  {
		  Reporter.log("Hii, welcome to beforeclass from class2",true);
	  }
	  @AfterClass()
	  public void afterclass()
	  {
		  Reporter.log("Hii, welcome to afterclass from class2", true);
	  }
	  @BeforeSuite()
	  public void beforesuite()
	  {
		  Reporter.log("Hii, welcome to beforesuite", true);
	  }
	  @AfterSuite()
	  public void aftersuite()
	  {
		 Reporter.log("Hii, welcome to aftersuite", true); 
	  }
}
