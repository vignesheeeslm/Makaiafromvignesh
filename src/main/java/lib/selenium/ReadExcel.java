package lib.selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@ Test
	public String[][] readExcel(String fileName) throws IOException{
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		XSSFRow headerRow = sheet.getRow(0);

		int lastCellNum = headerRow.getLastCellNum();
		String[][] data = new String[rowCount][lastCellNum];
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
				System.out.println(stringCellValue);
			}
		}

		wbook.close();
		return data;


	}

}
