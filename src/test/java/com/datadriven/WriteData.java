package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\kishv\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		FileInputStream file = new FileInputStream(f); 
		Workbook wb = new XSSFWorkbook(file);
	
		Sheet createSheet = wb.createSheet("Data Bases");
		wb.getSheet("Data Bases").createRow(0).createCell(0).setCellValue("NAME");
		wb.getSheet("Data Bases").getRow(0).createCell(1).setCellValue("LOAN AMOUNT");
		wb.getSheet("Data Bases").getRow(0).createCell(2).setCellValue("PAID AMOUNT");
		wb.getSheet("Data Bases").getRow(0).createCell(3).setCellValue("PENDING AMOUNT");
		
		wb.getSheet("Data Bases").createRow(1).createCell(0).setCellValue("BOSE");
		wb.getSheet("Data Bases").getRow(1).createCell(1).setCellValue("5,00,000");
		wb.getSheet("Data Bases").getRow(1).createCell(2).setCellValue("2,50,000");
		wb.getSheet("Data Bases").getRow(1).createCell(3).setCellValue("2,50,000");
		
		wb.getSheet("Data Bases").createRow(2).createCell(0).setCellValue("ABISHEK");
		wb.getSheet("Data Bases").getRow(2).createCell(1).setCellValue("5,00,000");
		wb.getSheet("Data Bases").getRow(2).createCell(2).setCellValue("5,00,000");
		wb.getSheet("Data Bases").getRow(2).createCell(3).setCellValue("NIL");
	
		wb.getSheet("Data Bases").createRow(3).createCell(0).setCellValue("LOGESH");
		wb.getSheet("Data Bases").getRow(3).createCell(1).setCellValue("5,00,000");
		wb.getSheet("Data Bases").getRow(3).createCell(2).setCellValue("4,25,000");
		wb.getSheet("Data Bases").getRow(3).createCell(3).setCellValue("75,000");
	
	   FileOutputStream output = new FileOutputStream(f);
	 wb.write(output);
	 wb.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
