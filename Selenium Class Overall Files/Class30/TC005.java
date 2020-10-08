package testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import datadriven.ExcelLibrary;

public class TC005
{
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		String filePath = "./resources/multipleTestData.xlsx";
		String sheetName = "credentials";
		return ExcelLibrary.getAllExcelSheetData(filePath, sheetName);
	}
	
	@Test(dataProvider="getData", description="Test Case to test Login with Multiple Credentials")
	public void testMultipleLogins(String user, String passd)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(passd);
		driver.findElement(By.id("loginButton")).click();
	}
}
//Iteration depends on Number of Sub Arrays
//Arguments depends on the number of data present in each sub array