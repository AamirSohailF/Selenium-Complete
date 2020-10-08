package datadriven;

public class UsingTheExcelLibraryMethod
{
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
		
		int[] arr = {10,20,30};
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}
}
