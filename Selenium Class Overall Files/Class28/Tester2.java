package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class Tester2 extends BasicSettings
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = "./resources/testdata.xlsx";
		String sheetName = "TC001";
		
		FileInputStream excelFile = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(excelFile);
		
		Sheet sheet = workbook.getSheet(sheetName);
		Row firstRow = sheet.getRow(1);
		
		String appUrl = firstRow.getCell(0).getStringCellValue();
		String username = firstRow.getCell(1).getStringCellValue();
		String password = firstRow.getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appUrl);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}
}
