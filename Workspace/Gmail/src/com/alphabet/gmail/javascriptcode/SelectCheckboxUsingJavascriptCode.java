package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectCheckboxUsingJavascriptCode extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].checked='true';", checkBox);
//			OR
//		js.executeScript("arguments[0].click()", checkBox);
		
		
	}
	
	
}
