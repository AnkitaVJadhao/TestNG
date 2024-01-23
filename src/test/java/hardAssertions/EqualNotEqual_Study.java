package hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualNotEqual_Study {
  @Test
  public void TC1() 
  {
	  String s1="Ankita";
	  String s2="Ankita";
	  String s3="Jadhao";
	  
	 //Equal and not Equal static method using Assert class
	 //It will check that s1 and s2 is equal then it will pass the test case  
	 Assert.assertEquals(s1, s2,"Both String is not equal , Test case is failed");
	  //Assert.assertEquals(s1, s3,"Both String is not equal , Test case is failed");
	 //It will check that s1 and s3 is not equal then it will pass the test case  
	 Assert.assertNotEquals(s1, s3,"Both String is equal , Test case is failed");
	 
  }
}
