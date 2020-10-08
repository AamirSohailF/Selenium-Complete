package com.alphabet.gmail.javascriptcode;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetMultipleElementsInJavascriptAndReturn extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		List<WebElement> allLinks =(List<WebElement>) js.executeScript("return document.getElementsByTagName('a');");
		
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		
		
		
	}
	
}
