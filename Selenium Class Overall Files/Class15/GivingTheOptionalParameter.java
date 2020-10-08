package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GivingTheOptionalParameter extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("console.log(arguments[0]);"+
						 "console.log(arguments[1]);"+
						 "console.log(arguments[2]);"
						 ,100,"Hello",'a');
		
	}
}
//2nd Argument is Var Args and the type is Object
//2nd Argument will act as input for the 1st Argument(code)
//2nd Argument is not mandatory
//2nd Argument can be a number, a boolean, String, WebElement
//arguments is array variable in JavaScript
//arrys in javascript are heterogenuos and dynamic
//arguments variable of javascript is like args varibale of main method of Java
