package dataprovider;

import org.testng.annotations.Test;

public class Testclass1
{
	@Test(dataProvider = "ganesh",dataProviderClass = Datapro_class.class)
	public void Test1(String fName,String lName,int exp) {
	System.out.println(fName+" "+lName+" "+exp);
	}

	@Test(dataProvider = "datatest2")
	public void test2(String name,String surname,int Exp) {//100
	System.out.println(name);
	System.out.println(surname);
	System.out.println(Exp);
	
	
	
	//	@DataProvider(name="datatest2")
	//
	//public Object[][] data(){
	//	Object[][]obj=new Object[2][3];
	//	
	//	obj[0][0]="Devashish";
	//	obj[0][1]="Makode";
	//	obj[0][2]=3;
	//	
	//	obj[1][0]="Dev";
	//	obj[1][1]="john";
	//	obj[1][2]=3;
	//	
	//	
	//	
	//	return obj;
	//	
	//	}

	
}
}
