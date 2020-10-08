package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Print Only The Numbers of the Table Data and Total Count of The All the Numbers from index.html

public class TableDataOnlyNumbersAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:/E:\\\\QSpiders\\\\Selenium\\\\Selenium Class Overall Files\\\\Class14\\\\index.html");
		
		WebElement table = driver.findElement(By.id("student"));
		
		List<WebElement> tableData = driver.findElements(By.tagName("td"));
		
		for (WebElement data : tableData) {
			String d = data.getText();
			if (d.contains("0") || d.contains("1") || d.contains("2") || d.contains("3") || d.contains("4") || d.contains("5")
			 || d.contains("6") || d.contains("7") || d.contains("8") || d.contains("9")) {
				
				System.out.println(d);
			}
			
			
		}
		
		driver.close();
		
		
		
	}
	
}
