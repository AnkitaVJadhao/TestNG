package coverFoxUsingTestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider
{
	
	@DataProvider(name = "RegressionTest")	
	public static String[][] fbAccount() throws IOException
	{
		 // We are creating an object from the excel sheet data by calling a method that
        // reads data from the excel stored locally in our system
		  String data[][]= getExcelData();
		  return data;
	}
	
	
	public static String[][] getExcelData() throws EncryptedDocumentException, IOException
    {
    	
    	FileInputStream myFile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");  
    	//when we have to handle excel then we have to create object of FileInputStream class
    	
    	Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet4");
    	
    	int lastRowNum = myWorkbook.getLastRowNum(); //travelsing
    	
    	int totalNumOfRows= lastRowNum;  ////travelsing
    	
    	System.out.println(totalNumOfRows);
	
    	short lastCellNum = myWorkbook.getRow(0).getLastCellNum();//number of column
    	
    	int totalNumOfCells = lastCellNum-1;   
    	
    	System.out.println(totalNumOfCells);
    	
	 
    	String[][] values =new String[lastRowNum+1][totalNumOfCells+1];
    	
    	//we need this 
    	//return the 
    	//one is for row and another one is for column 
	   
	    for(int i=0;i<=totalNumOfRows;i++)
	    {
	    	for(int j=0;j<=totalNumOfCells;j++)
	    	{
	    		values[i][j] =myWorkbook.getRow(i).getCell(j).getStringCellValue();
	    		//[0][0]
	    		//[0][1]
	    		//[0][2]
	       }
	    	System.out.println();
	    }
	    return values;
    }

}


