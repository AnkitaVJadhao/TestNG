package hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fail_Study {
  @Test
  public void TC01()
  {
	  //This method is used to intentionally failed test method.
	  
	  Assert.fail();
	  

  }
}
