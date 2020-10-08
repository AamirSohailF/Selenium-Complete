package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ScrollTowardsTheEndOfTheWebPage extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
}