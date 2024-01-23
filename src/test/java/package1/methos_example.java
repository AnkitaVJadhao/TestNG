package package1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class methos_example
{
		@BeforeMethod
         public void beforemethod()
		{
			System.out.println("This is before test");
		}
		
		@AfterMethod
        public void afterStudy()
		{
			System.out.println("This is after test");
		}
		
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("This is Before class method");
		}
		@BeforeTest
		public void beforetest()
		{
			System.out.println("This is Before test method");
		}
		
		
	@Test
	//-5000 to +5000
	public void method1()
	{
		System.out.println("Hi method1");
	}
	@Test
	public void method2()
	{
		System.out.println("Hi method2");
	}
	@Test
	public void method3()
	{
		System.out.println("Hi method3");
	}
	@Test
	public void method4()
	{
		System.out.println("Hi method4");
	}
	
}
