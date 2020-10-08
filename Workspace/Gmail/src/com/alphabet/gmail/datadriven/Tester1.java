package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester1 {

	public static void main(String[] args) throws IOException {

		//	Store the filePath and Sheet Name
		String filePath = "./resources/testdata.xlsx";
		String sheetName = "Sheet1";

		//	Create The Object of FileInputStream with Excel filePath
		FileInputStream excelFile = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(excelFile);
		
		//	Get the Sheet from which you want to fetch the Data
		Sheet sheet = wb.getSheet(sheetName);
		
		//	Get the Data from the Sheet's Rows and Columns
		Row row = sheet.getRow(1);
		String usernameData = row.getCell(1).getStringCellValue();
		System.out.println(usernameData);
		
		
		
	}
	
}
