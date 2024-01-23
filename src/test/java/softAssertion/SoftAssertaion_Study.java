package softAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertaion_Study {
  @Test
  public void Tc1() 
  {
	  boolean a=true;
	  boolean b=false;
	  SoftAssert s1=new SoftAssert();
	  s1.assertTrue(b,"B is not false, TC failed");
	  s1.assertTrue(a,"a is not true, TC failed");
	  s1.assertAll();
  }
  @Test
  public void TC2()
  {
	  String a="Ankita";
	  String b="Jadhao";
	  
	  SoftAssert s2=new SoftAssert();
	  s2.assertNotNull(a,"A is null , TC is failed");
	  s2.assertAll();
	  
	  
  }
}
