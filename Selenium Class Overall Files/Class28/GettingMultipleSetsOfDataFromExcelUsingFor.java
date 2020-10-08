package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GettingMultipleSetsOfDataFromExcelUsingFor
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = "./resources/multipleTestData.xlsx";
		String sheetName = "credentials";
		
		Sheet sheet = WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		
		for(int i=1;i<=5;i++)//Rows-->0,1,2,3,4,5
		{
			for(int j=0;j<=1;j++)//Cell Data-->0,1
			{
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
	}
}
