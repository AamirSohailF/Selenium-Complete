package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	WAS to Clear the data from the username text field w/o clear/SendKeys method.
//		Site:: https://demo.vtiger.com/vtigercrm/

public class ClearTextFieldUsingJavaScriptAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].value=''", username);
		
	}
	
}

