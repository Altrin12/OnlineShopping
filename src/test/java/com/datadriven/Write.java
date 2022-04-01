package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\altri\\Pictures\\Project Class\\Documents\\Test Case\\Blank Sheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("UserDetails").createRow(0).createCell(0).setCellValue("User Name");
		wb.getSheet("UserDetails").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("UserDetails").createRow(1).createCell(0).setCellValue("Altrin");
		wb.getSheet("UserDetails").getRow(1).createCell(1).setCellValue("Altrin@123");

		wb.getSheet("UserDetails").createRow(2).createCell(0).setCellValue("Hannah");
		wb.getSheet("UserDetails").getRow(2).createCell(1).setCellValue("123");

		wb.getSheet("UserDetails").createRow(3).createCell(0).setCellValue("John");
		wb.getSheet("UserDetails").getRow(3).createCell(1).setCellValue("john@123");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

		System.out.println("Write Successfully");
	}
}
