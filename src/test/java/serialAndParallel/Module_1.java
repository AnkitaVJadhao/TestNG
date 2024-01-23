package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Module_1 {
  @Test
  public void Ajio() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
  }
}
