package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetTheTextInWebPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		WebElement pleaseIdentifyYourselfText = driver.findElement(By.id("headerContainer"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver ;
		
		Object obj = js.executeScript("return arguments[0].innerText;", pleaseIdentifyYourselfText);			//			return type is object
		String s = (String) obj ;			//		Therefore dowcasting it to String				
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
//	------------------------------------------ OR ------------------------------------------
		
//		String s = (String)js.executeScript("return arguments[0].innerText;", pleaseIdentifyYourselfText);
//		System.out.println(s);
//		System.out.println(s.toUpperCase());
		
		
		driver.close();
	}
	
	
}
