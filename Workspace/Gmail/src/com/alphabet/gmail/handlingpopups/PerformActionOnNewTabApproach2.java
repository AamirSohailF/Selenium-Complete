package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PerformActionOnNewTabApproach2 extends BasicSettings {

public static void main(String[] args) {
		
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		String parentWindow = driver.getWindowHandle();
		
		windowIDs.remove(parentWindow);
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);
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
