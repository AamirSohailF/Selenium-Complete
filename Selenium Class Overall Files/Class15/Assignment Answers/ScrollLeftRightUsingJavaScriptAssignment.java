package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Write a Script to Scroll Left and Scroll Right Using Javascript Executor method

public class ScrollLeftRightUsingJavaScriptAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollBy(400, 0);");
		
	}
	
}
