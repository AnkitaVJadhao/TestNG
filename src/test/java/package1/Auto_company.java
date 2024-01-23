package package1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Auto_company 
{

	@Test
	@Parameters({"j"})
	public void auto(String a)
	{
		System.out.println(a);
	}
}
