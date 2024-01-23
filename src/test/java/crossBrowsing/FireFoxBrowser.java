package crossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxBrowser 
{
	
  @Test
  public void TC1() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/login/");
  }
 
}
