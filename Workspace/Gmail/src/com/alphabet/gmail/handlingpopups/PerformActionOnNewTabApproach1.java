package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PerformActionOnNewTabApproach1 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		String expectedTitle = "actiTIME - Time Tracking Software for Boosting Your Business";
		
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);					//				switching driver control of tab using for loop
			if (driver.getTitle().equals(expectedTitle)) {
				break;
			}
		}
		
		
		driver.findElement(By.linkText("Pricing")).click();
		
		
		/*
		 * 			OR
		 * 
		 *	((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.linkText("Pricing")));
		 * 	
		 * 	----------------------   Done through Javascript Executor   ----------------------
		 * 
		 * 
		 */
		
		mySleepInSeconds(5);			//			for observation
		driver.quit();
		
		
	}
	
}
