package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingTableElements extends BasicSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = setUp("file:///D:/Java%20Selenium/SCSW4/Session%2019/index.html");
		WebElement table = driver.findElement(By.id("student"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> columns=table.findElements(By.tagName("th"));
		List<WebElement> tableData=table.findElements(By.tagName("td"));
		
		System.out.println("The Total Rows is::"+rows.size());
		System.out.println("The Total Columns is::"+columns.size());
		System.out.println("The Total Data is::"+tableData.size());
		
		for(WebElement data:tableData)
		{
			String s = data.getText();
			if(!s.isEmpty())
			{
				System.out.println(s);
			}
			
		}
		
		
		driver.close();
	}
}
