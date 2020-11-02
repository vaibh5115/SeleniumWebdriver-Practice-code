package DDT_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		File file1 = new File("E://eclipse_workspace//data3.xlsx");
		
		FileInputStream fis=new FileInputStream(file1);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Counting rows
		int rowCount=sheet.getLastRowNum();// retuns number of rows
		int colCount=sheet.getRow(0).getLastCellNum(); // returns number of cells present in a row
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		for(int r=0;r<=rowCount;r++)
		{
			
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<colCount;c++)
			{
				//XSSFCell cell=row.getCell(c);
				// value=cell.toString();
				String value=row.getCell(c).toString();
				System.out.print(value+"   ");
			}
			
			System.out.println();
			
		}
		

	}

}