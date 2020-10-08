package com.alphabet.gmail.datadriven;

public class UsingTheExcelLibraryMethod {

	public static void main(String[] args) 
	{
		Object[][] objArr = ExcelLibrary.getAllExcelSheetData("./resources/multipleTestData.xlsx", "credentials");
		for(Object[] obj:objArr)
		{
			for(Object o:obj)
			{
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
	}
	
}
