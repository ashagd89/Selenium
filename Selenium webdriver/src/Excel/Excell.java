package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell
{
	public static void main( String []args) throws IOException 
	{
FileInputStream file=new FileInputStream("C://Users//KiranAnnegowda//Desktop//Book1.xls");	
 
HSSFWorkbook workbook=new HSSFWorkbook(file);


HSSFSheet sheet=workbook.getSheet("Sheet1");// providing sheet name

 int rowcount=sheet.getLastRowNum();
 
 int colcount=sheet.getRow(0).getLastCellNum();
 
 for(int i=0;i<rowcount;i++)
 {
	 
	 HSSFRow currentrow=sheet.getRow(i); 

		for(int j=0;j<colcount;j++) 
		{
			
			String value=currentrow.getCell(j).toString();	
			
			if(j==0)
			{
				String UserName=value;
				System.out.print("UserName "+UserName);
			}
			
			if(j==1)
			{
				String Password=value;
				System.out.print(" Password "+Password);
			}
			//System.out.print(" "+value);
		}
	System.out.println(); 
 }
		
		
		
		
		
		
		
		
		
	}	
}