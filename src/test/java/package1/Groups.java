package package1;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups = "IT")
  public void infosys() 
  {
	  System.out.println("Infosys");
  }
  @Test(groups = "IT")
  public void wipro() 
  {
	  System.out.println("Wipro");
  }
  @Test(groups = "Auto")
  public void honda() 
  {
     System.out.println("Honda");
  }
  @Test(groups = "Auto")
  public void hero() 
  {
	  System.out.println("Hero");
  }
}
