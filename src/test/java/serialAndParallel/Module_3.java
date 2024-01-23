package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Module_3 {
	  @Test
	  public void Flipkart() 
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
	  }
}
