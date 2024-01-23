package testNg_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class methods
{
	@Test
	public void facebooklogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");	
		Reporter.log("Fb launch",true);
	}
	@Test
	public void instalogin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Reporter.log("Insta login",true);
		
	}
	@Test
	public void twitterLaunch()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://twitter.com/i/flow/login");
		Reporter.log("Twitter login",true);
		
	}
	
}
