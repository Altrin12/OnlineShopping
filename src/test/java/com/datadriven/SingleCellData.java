package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleCellData {

	public static void particularCellData() throws Throwable {

		File f = new File ("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Sample Data 1.xlsx");	

		FileInputStream fis = new FileInputStream (f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(4);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {
			String cv = c.getStringCellValue();
			System.out.println(cv);

		}
		else if (type.equals(CellType.NUMERIC)){
			double cellValue = c.getNumericCellValue();
			int value = (int) cellValue;
			System.out.println(value);
		}
		wb.close();
	}

	public static void main(String[] args) throws Throwable {

		particularCellData();
	}
}
