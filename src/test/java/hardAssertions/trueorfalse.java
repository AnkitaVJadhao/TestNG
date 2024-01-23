package hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class trueorfalse {
  @Test
  public void TC1()
  {
	  boolean a=true;
	  boolean b=false;
	  //This method is use to verify conditions are true or false. If condition is true output is 
	  //pass otherwise fail.

	  Assert.assertTrue(a,"A is not true ,TC is failed");
	  
	  //Use to verify conditions are true or false, if condition is true output is fail and if 
	 // condition is false then output is pass.

	  Assert.assertFalse(b,"B is true , TC is failed");
  }
}
