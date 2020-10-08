package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetTheHeightOfWebPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		 long height = (long) js.executeScript("return document.body.scrollHeight");
		 
		 System.out.println(height);
		
		
		
	}
	
	
}
