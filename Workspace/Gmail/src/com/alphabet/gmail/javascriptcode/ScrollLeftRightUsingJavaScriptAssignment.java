package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Write a Script to Scroll Left and Scroll Right Using Javascript Executor method

public class ScrollLeftRightUsingJavaScriptAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		Dimension dim = driver.manage().window().getSize();
		
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollBy(40, 0);");
		mySleepInSeconds(3);
		js.executeScript("window.scrollBy(-20, 0);");
		
	}
	
}
