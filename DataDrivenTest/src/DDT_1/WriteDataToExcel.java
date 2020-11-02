package DDT_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file=new FileOutputStream("E://eclipse_workspace/WrittenData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("MyData");	
		
		for(int r=0;r<=4;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<=3;c++)
			{
				row.createCell(c).setCellValue("Vaibhav");
			}
		
		}
		
		wb.write(file);
		
		System.out.println("Writing data into excel file is completed...");
	}

}
