package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\kishv\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		FileInputStream file = new FileInputStream(f); 
		Workbook wb = new XSSFWorkbook(file);
	//sheet
		Sheet sheetAt = wb.getSheetAt(0);
	//no of rows
		int pnr = sheetAt.getPhysicalNumberOfRows();
	//loop
		for (int i = 0; i < pnr; i++) {
	//row		
		Row row = sheetAt.getRow(i);
	//no of cells	
		int pnc = row.getPhysicalNumberOfCells();
		for (int j = 0; j < pnc; j++) {
	//cell	
			Cell cell = row.getCell(j);
	//celltype
			CellType cellType = cell.getCellType();
	//condition		
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
			}		
		}
		
	}

  }

}
