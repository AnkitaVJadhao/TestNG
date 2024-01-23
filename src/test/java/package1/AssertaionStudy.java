package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertaionStudy {
  @Test
  
  public void checktitle() 
  {
	  String currentURL= "https://www.facebook.com/login/";
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  String expectedURL=driver.getCurrentUrl();
	  System.out.println(expectedURL);
	  Assert.assertEquals(currentURL, expectedURL,"CorrectURL"); 
  }
}
