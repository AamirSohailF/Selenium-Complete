package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	What is Exception thrown if other keys rather than modifier keys (SHIFT,CTRL,ALT) are used for keyDown Method of actions Class

public class IdentifyExceptionThrownAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		WebElement searchBox = driver.switchTo().activeElement();
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.EQUALS);		//		IllegalArgumentException/IdentifyExceptionThrown
		/*
		 * 	IllegalArgumentException/IdentifyExceptionThrown is thrown here because we cannot use any other keys rather than modifier keys (SHIFT,CTRL,ALT)
		 */
		actions.keyDown(Keys.EQUALS);		//		IllegalArgumentException/IdentifyExceptionThrown
		actions.perform();
		
		driver.close();
		
		
	}
	
}
