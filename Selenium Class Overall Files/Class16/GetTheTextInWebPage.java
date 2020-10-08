package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetTheTextInWebPage extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		WebElement pleaseText = driver.findElement(By.id("headerContainer"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String s = (String)js.executeScript("return arguments[0].innerText;", pleaseText);
		System.out.println(s);
		System.out.println(s.toUpperCase());
	}
}
//document.body.scrollHeight

//MDN ==> Netscape ==> 