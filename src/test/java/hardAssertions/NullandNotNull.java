package hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NullandNotNull 
{
	@Test
	public void null_notNull()
	{
		String a=null;
		String b="Hii, I am not null";
		//This method is use to verify components or text fields empty or null if it is empty 
		//output is pass otherwise fail.

		Assert.assertNull(a,"a is not null , TC is failed");
		//Assert.assertNull(b,"b is not null , TC is failed");
		
		//Use to verify components or text fields empty or not, if it is not empty output is pass 
		//otherwise fail.
		Assert.assertNotNull(b,"b is null, TC is failed");
		//Assert.assertNotNull(a,"a is null, TC is failed");
		
	}
}

