package DataProvider_Study;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBAccountForm_UsingExcel 
{
	
  @Test(dataProvider = "RegressionTest", dataProviderClass = DataProvider_ExcelSheet.class)
  public static void fbAccount(String firstname,String lastname,String mobileNumber ) throws InterruptedException, IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  Thread.sleep(500);
	  driver.findElement(By.linkText("Sign up for Facebook")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobileNumber);
	  Thread.sleep(500);
	  driver.close();
  }
}
