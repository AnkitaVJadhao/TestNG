package DataProvider_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_ExcelSheet
{
 
	@DataProvider(name = "RegressionTest")	
	public static String[][] fbAccount() throws IOException
	{
		 // We are creating an object from the excel sheet data by calling a method that
        // reads data from the excel stored locally in our system
		  String data[][]= getExcelData("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		  return data;
	}
	
	 // This method handles the excel - opens it and reads the data from the
    // respective cells using a for-loop & returns it in the form of a string array
 
    public static String[][] getExcelData(String filepath) throws EncryptedDocumentException, IOException
    {
    	
    	FileInputStream myFile=new FileInputStream(filepath);  //when we have to handle excel then we have to create object of FileInputStream 
    	
    	Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet2");
    	
    	int lastRowNum = myWorkbook.getLastRowNum(); //travelsing
    	
    	int totalNumOfRows= lastRowNum;  ////travelsing
    	
    	System.out.println(totalNumOfRows);
	
    	short lastCellNum = myWorkbook.getRow(0).getLastCellNum();//number of column
    	
    	int totalNumOfCells = lastCellNum-1;   //3-1
    	
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
	    return values; //if we have to use  
    }


}
