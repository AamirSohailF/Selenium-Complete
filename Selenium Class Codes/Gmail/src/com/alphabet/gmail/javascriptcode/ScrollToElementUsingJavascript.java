package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ScrollToElementUsingJavascript extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		WebElement readMoreButton=driver.findElement(By.linkText("READ MORE"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",readMoreButton);
	}
}