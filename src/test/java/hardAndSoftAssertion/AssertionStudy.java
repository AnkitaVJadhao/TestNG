package hardAndSoftAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionStudy {
  @Test
  public void validateTitle() 
  {
	  SoftAssert softassert=new SoftAssert();
	  softassert.assertTrue(false);
	  softassert.assertEquals("omayo", "omayo");
	  System.out.println("Welcome");
	  softassert.assertAll();
  }
  @Test
  public void validateTitle1()
  {
		
		Assert.assertTrue(false);
		Assert.assertEquals("omayo", "omayo");
		System.out.println("Welcome");
  }
  
  //Differece between :- softassert and hardasser :-
  //A Hard Assertion is a type of assertion that throws an exception imeditely  when an assert statement fails
  //Soft Assertions are the type of assertions that don't throw an exception instantaneously when an assertion fails. 
  //We  needs to call assertAll(), to view assertions at the end of the test result.
}
