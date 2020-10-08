package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ChangeTheTextInWebPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		WebElement pleaseIdentifyYourselfText = driver.findElement(By.id("headerContainer"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].innerText = 'This Text Has Changed';", pleaseIdentifyYourselfText);
		
		
	}
	
	
}
