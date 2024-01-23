package package1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class It_company 
{

	@Test
	@Parameters({"i"})
	public void it(String a)
	{
		System.out.println(a);
	}
}
