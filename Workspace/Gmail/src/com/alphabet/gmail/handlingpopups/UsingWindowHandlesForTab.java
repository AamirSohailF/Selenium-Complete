package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class UsingWindowHandlesForTab extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		mySleepInSeconds(15);			//		for observation
		driver.close();				/*			since driver control is in the login page of actitime and is not switched hence new tab does not close
												instead login page of actitime closes
		 							*/
		
		
	}
	
}
