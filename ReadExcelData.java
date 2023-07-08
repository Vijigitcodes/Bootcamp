package salesforce;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcelData {
	
	@Test	
		public void runExcel() throws IOException { 
		XSSFWorkbook workbook = new XSSFWorkbook("./data/Login.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		System.out.println("Total Row in the workbook: " + sheet.getLastRowNum());
		System.out.println("Total Column in the workbook: " + sheet.getRow(0).getLastCellNum());
		for (int i = 0; i< row.getLastCellNum(); i++) {
			for (int j = 0; j< sheet.getRow(i).getLastCellNum(); j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				
				
			}
		}
			
		workbook.close();
	}	
}

