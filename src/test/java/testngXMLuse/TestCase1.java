package testngXMLuse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1
{
  @Test
  public void Tc1()
  {
	  Reporter.log("Hi Tc1",true);
  }
  @Test
  public void Tc2()
  {
	  Reporter.log("Hi Tc2",true);
  }
  @Test
  public void Tc3()
  {
	  Reporter.log("Hi Tc3",true);
  }
  @Test
  public void Tc4()
  {
	  Reporter.log("Hi Tc4",true);
  }
}
