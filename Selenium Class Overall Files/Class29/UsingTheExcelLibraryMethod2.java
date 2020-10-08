package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class UsingTheExcelLibraryMethod2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		String user=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "credentials",3,0);
		String pass=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "credentials",3,1);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	}
}
