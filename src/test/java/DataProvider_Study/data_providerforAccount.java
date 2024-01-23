package DataProvider_Study;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_providerforAccount 
{
	//method--> data Provider
	// String firstName, String LastName, String MobNum
	
	@DataProvider(name="RegressionTest")
  public static String[][] fbDataset()
  {
	  String data[][]= {{"Ankita","Jadhao","9403599094"},{"Velocity","Training","7057774212"}};
	  return data;
	  
  }
	
  @DataProvider(name="SanityTest")
  public static String[][] fbDataset1()
  {
	  String data[][]= {{"ABC","XYZ","9403599094"},{"PQR","MNO","7057774212"}};
	  return data;
	  
  }
}
