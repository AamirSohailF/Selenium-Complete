package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ClickOnAnElementUsingJavScript extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",loginButton);
	}
}
//Whenever Selenium WebDriver's click() doesnt work we can use JavaScript Executor's click Method as shown Above