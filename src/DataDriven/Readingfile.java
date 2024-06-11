package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Readingfile {

	public static void main(String[] args) throws IOException 
	{
		// Location of file
		
		String excelfilepath = ".\\DataFiles\\Contries.xlsx";
		
		// Read data from excel
		
		FileInputStream inputstream = new FileInputStream(excelfilepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet = workbook.getSheet("Contries");
		
		
		// read data from sheet   
		
		int rows  = sheet.getLastRowNum();
		int clumn = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rows;r++)
		{
			
			XSSFRow row= sheet.getRow(r);
			
			for(int c=0; c<=clumn; c++) 
			{
				XSSFCell cell = row.getCell(c);
				
				
				
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				
				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				}
				
			}
		}
		
		
	}

}
