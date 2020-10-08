package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class EnterDataIntoDisabledTextFieldUsingJavaScript extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/");
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].value='skillrary'", disabledTextField);
		
	}
	
}
