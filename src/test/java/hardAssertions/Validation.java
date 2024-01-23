package hardAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
  @Test
  public void FBCheckBox() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Sign up for Facebook")).click();
	  
	  boolean radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  
	  //if radiobutton is enabled then Testcase is pass else it will fail
	  if(radiobutton)
	  {
		  System.out.println("Test case passed");
	  }
	  else
	  {
		  System.out.println("Test case failed");
	  }
	  //In above code radio is not selected but still testng display the pass stauts but It should be failed
	  //If above verification process is used to verify expected result of a test case, length of Test 
	  //script will take more time for execution.
	  //To reduce length of test script we need to use Assert class for verification which contains 
      //Static methods present in Assert class (Hard Assert)
	  
	  Assert.assertTrue(radiobutton,"TC is failed Radio button is not seleceted");
	  //assertTrue is static method and all  static method should be imported from org.TestNG
	  
	  
  }
}
