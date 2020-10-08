package datadriven;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class StoreMultipleSetsOfDataFromExcelUsingFor2
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = "./resources/multipleTestData.xlsx";
		String sheetName = "credentials";
		
		Sheet sheet = WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		int rowsCount = sheet.getPhysicalNumberOfRows();//6
		
		Object[][] sarr = new Object[rowsCount-1][];//5 Size should be equal to number of rows except header row
		
		for(int i=1,k=0;i<=rowsCount-1;i++,k++)//1//2//3//4//5
		{
			int cellsCount = sheet.getRow(i).getPhysicalNumberOfCells();
			
			sarr[k]=new String[cellsCount];
			
			for(int j=0;j<=cellsCount-1;j++)
			{
				sarr[k][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		
		for(int i=0;i<=sarr.length-1;i++)
		{
			for(int j=0;j<=sarr[i].length-1;j++)
			{
				System.out.print(sarr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
