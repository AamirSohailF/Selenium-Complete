package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ScrollingTheWindow extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollBy(0, 1000);");
		mySleepInSeconds(3);
		js.executeScript("window.scrollBy(0, -500);");
		
	}
	
}
