package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro_class
{
	@DataProvider(name="ganesh")
	public Object[][] data()
	{
		Object[][]obj=new Object[2][3];
		
		obj[0][0]="Devashish";
		obj[0][1]="Makode";
		obj[0][2]=3;
		
		obj[1][0]="Dev";
		obj[1][1]="john";
		obj[1][2]=3;
		

		return obj;
		
		}

}

