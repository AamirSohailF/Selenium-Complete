package com.alphabet.gmail.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class UsingTheExcelLibraryMethod2 extends BasicSettings {
	
	public static void main(String[] args) 
	{
		String user=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "credentials",4,0);
		String pass=ExcelLibrary.getCellData("./resources/multipleTestData.xlsx", "credentials",4,1);
		
		//	Using sheet data in site
		WebDriver driver = setUp();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	}
	
}
