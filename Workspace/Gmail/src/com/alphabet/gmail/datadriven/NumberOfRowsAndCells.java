package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumberOfRowsAndCells {

	public static void main(String[] args) throws IOException 
	{
		String filePath = "./resources/multipleTestData.xlsx";
		String sheetName = "credentials";
		
		Sheet sheet = WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());//Zero Based Row Number
		
		System.out.println("===============");
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println(sheet.getRow(0).getLastCellNum());
	}
	
}
