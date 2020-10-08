package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateTheElementInJavascriptAndReturn extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement username = (WebElement) js.executeScript("return document.getElementById('username');");
		username.sendKeys("Aamir");
		
	}
	
	
}
