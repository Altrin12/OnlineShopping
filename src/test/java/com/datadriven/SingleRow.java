package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleRow {

	public static void singleRow() throws Throwable {

		File f = new File ("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Sample Data 1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);		
		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);

		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double numericValue = c.getNumericCellValue();
				int v = (int) numericValue;
				String value = Integer.toString(v);
				System.out.println(value);
			}	
		}


		wb.close();
	}	
	public static void main(String[] args) throws Throwable {

		singleRow();
	}
}
