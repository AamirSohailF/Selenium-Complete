package com.alphabet.gmail.javascriptcode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateTheElementInJavascript extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('username').value='mohan';");
	}
}
