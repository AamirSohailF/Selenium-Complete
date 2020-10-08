package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WaS to get the Title and CurrentURL of the Actitime using JavaScript

public class GetTitleAndURLOfWebPageAssignment extends BasicSettings {

	
	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		System.out.println("----------- Title of the WebPage -----------");
		Object title = js.executeScript("return document.getElementsByTagName('title')[0].innerText;");		//		Originally returns Object type
		System.out.println(title);
		
//		OR
		
//		String s = (String) js.executeScript("return document.getElementsByTagName('title')[0].innerText;");		//		downcasting Object type to String type
//		System.out.println(s);
		
		
		System.out.println();
		
		
		System.out.println("----------- URL of the WebPage -----------");
		Object url = js.executeScript("return document.URL");		//		Originally returns Object type
		System.out.println(url);
		
//		OR
		
//		String url = (String) js.executeScript("return document.URL");		//		downcasting Object type to String type
//		System.out.println(url);
		
		
		mySleepInSeconds(2);
		driver.close();
	}
	
}
