package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingTableElements extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:/E:\\QSpiders\\Selenium\\Selenium Class Overall Files\\Class14\\index.html");
		WebElement table = driver.findElement(By.id("student"));			//			parent element driver child element table
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = table.findElements(By.tagName("th"));
		List<WebElement> tabledata = table.findElements(By.tagName("td"));
		
		System.out.println("Total rows : " + rows.size() );
		System.out.println("Total columns : " + columns.size());
		System.out.println("Total Data is : " + tabledata.size());
		
		for (WebElement data : tabledata) {
			String d = data.getText();
			if (!d.isEmpty()) {
				System.out.println(d);
			}
		}
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
	
}
