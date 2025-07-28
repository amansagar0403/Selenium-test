package com.readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Apache POI\\ApacheTestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data2);

	}

}
