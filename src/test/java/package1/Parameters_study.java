package package1;

import org.testng.annotations.*;


public class Parameters_study
{
	
	//Parameters :- 
	@Test
	@Parameters({"i","j"})
	public void method1(int a, int b)
	{
		System.out.println(a+b);
	}
	@Test
	@Parameters({"i","j"})
	public void method2(int a, int b)
	{
		System.out.println(b-a);
	}
	@Test
	@Parameters({"i","j"})
	public void method3(int a, int b)
	{
		System.out.println(a/b);
	}
	
}
