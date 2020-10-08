package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

/*
 * 	WAS to verify if the url doesnt change when user clicks on Cancel Button in the COnfirmation Popup of below Website
								Site ------- https://www.licindia.in
 */

public class HandlingConfirmationPopupInLICAppAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.licindia.in");
		driver.findElement(By.linkText("Customer Portal")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println("Alert Message Displayed : " + alertMessage);
		
		alert.dismiss();
		
		String expectedURL = "https://www.licindia.in/";
		String actualURL = driver.getCurrentUrl();
		
		
		System.out.println("Expected URL : " + expectedURL);
		System.out.println("Actual URL : " + actualURL);
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		mySleepInSeconds(2);
		driver.close();
		
		
		
	}
	
}
