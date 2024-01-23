package testNg_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Use_Reporter
{
	@Test
	public void method()
	{
		System.out.println("Hi I am printing statement");
		//Reporter :- class 
		//If we doesnot provide the paramenter in the log method then it will not display stmt in console 
		Reporter.log("Hi this is reporter , without boolean parameter");
		Reporter.log("Hi this is reporter , with boolean parameter",true);
	}
	
}
