package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ScrollToElementUsingJavascript extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.monsterindia.com/trex/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement readMore = driver.findElement(By.id("career-advice-read-more"));
		
		js.executeScript("arguments[0].scrollIntoView()", readMore);
		
	}
	
}
