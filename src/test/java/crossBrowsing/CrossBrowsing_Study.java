package crossBrowsing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing_Study 
{
	@Parameters({"bname","fname","lname","mnumber"})
  @Test
  public void f(String browserName,String firstname,String lastname,String mobilenumber) throws InterruptedException 
  {
	  WebDriver driver=null;
	  
	  if(browserName.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browserName.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(browserName.equals("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  Thread.sleep(500);
	  driver.findElement(By.linkText("Sign up for Facebook")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobilenumber);
	  Thread.sleep(500);
	  driver.close();
  }
}
