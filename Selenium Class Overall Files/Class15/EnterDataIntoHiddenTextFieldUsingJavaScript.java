package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class EnterDataIntoHiddenTextFieldUsingJavaScript extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement hiddenTextField=driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='abcd';",hiddenTextField);
	}
}