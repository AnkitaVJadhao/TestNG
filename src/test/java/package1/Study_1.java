package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Study_1 
{
	
	
	@Test(priority = 0)
		public  void validate()
		{
		
		String actualtitle="ABC";
		System.out.println("Hello");
		//	WebDriver driver=new ChromeDriver();
		//	driver.manage().window().maximize();
		//	driver.get("https://www.w3schools.com/");
		//	String title=driver.getTitle();
		//	System.out.println(title);
		//Validate the 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		String title=driver.getTitle();
		assertEquals(actualtitle, title);
	
		}
		//(enabled=false)
	//-5000 to +5000:- Range 
	@Test(priority = 1)
	public void check()
	{
		System.out.println("Hii TestNG");
	}
	@Test(priority = -1)
	public void test1()
	{
		System.out.println("Hii Test1");
	}
	@Test(priority = -2)
	public void test2()
	{
		System.out.println("Hii Test2");
	}
	
		
}
