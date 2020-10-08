package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ScrollingTheWindowUsingVariable extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		int pixels = 1000 ;
		
		js.executeScript("window.scrollBy(0," + pixels +");");
		
		
	}
	
	
}
