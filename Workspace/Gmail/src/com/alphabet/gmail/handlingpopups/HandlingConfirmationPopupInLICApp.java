package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingConfirmationPopupInLICApp extends BasicSettings {

public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.licindia.in/");
		driver.findElement(By.linkText("Customer Portal")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println("Alert Message Displayed : " + alertMessage);
		
//		mySleepInSeconds(1);			//		for observation
		
		alert.accept();
		
//		mySleepInSeconds(1);			//		for observation
		
		String expectedURL = "https://www.licindia.in/Home-(1)/LICOnlineServicePortal";
		String actualURL = driver.getCurrentUrl();
		
		System.out.println("Expected URL : " + expectedURL);
		System.out.println("Actual URL : " + actualURL);
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		
		driver.close();
		
	}
	
}
