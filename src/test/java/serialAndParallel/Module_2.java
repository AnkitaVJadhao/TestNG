package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Module_2 {
	  @Test
	  public void Amazone() 
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
	  }
}
