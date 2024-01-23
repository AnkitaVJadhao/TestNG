package package1;

import org.testng.annotations.Test;

public class Annotation_Description {
  @Test(description = "This is f method")
  public void f() 
  {
	  //System.out.println(4/0);
	  System.out.println("Hii");
  }
  @Test(dependsOnMethods = "f")
  public void e() 
  {
	  System.out.println("Hello");
  }
  @Test(timeOut = 200) //ms
  public void a() throws InterruptedException 
  {
	//  Thread.sleep(400);
	  System.out.println("Timeout");
  }
  
  
  
  
}
