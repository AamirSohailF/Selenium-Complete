package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GettingMultipleSetsOfDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./resources/multipleTestData.xlsx";
		String sheetName = "credentials";
		
		Sheet sheet = WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		
		Row row1 = sheet.getRow(1);
		String user1 = row1.getCell(0).getStringCellValue();
		String pass1 = row1.getCell(1).getStringCellValue();
		
		Row row2 = sheet.getRow(2);
		String user2 = row2.getCell(0).getStringCellValue();
		String pass2 = row2.getCell(1).getStringCellValue();
		
		Row row3 = sheet.getRow(3);
		String user3 = row3.getCell(0).getStringCellValue();
		String pass3 = row3.getCell(1).getStringCellValue();
		
		Row row4 = sheet.getRow(4);
		String user4 = row4.getCell(0).getStringCellValue();
		String pass4 = row4.getCell(1).getStringCellValue();
		
		Row row5 = sheet.getRow(5);
		String user5 = row5.getCell(0).getStringCellValue();
		String pass5 = row5.getCell(1).getStringCellValue();
		
		Row row6 = sheet.getRow(6);
		String user6 = row6.getCell(0).getStringCellValue();
		String pass6 = row6.getCell(1).getStringCellValue();
		
		
		
		System.out.println("------- Usernames -------");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
		System.out.println(user6);
		
		
		System.out.println("------- Passwords -------");
		System.out.println(pass1);
		System.out.println(pass2);
		System.out.println(pass3);
		System.out.println(pass4);
		System.out.println(pass5);
		System.out.println(pass6);
	}
	
}
