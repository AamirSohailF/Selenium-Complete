package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingAlertPopup extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:///E:/QSpiders/Selenium/Selenium%20Class%20Overall%20Files/Class20/index.html");
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		System.out.println("Alert Message : " + alertMessage);
		
		alert.accept();
//		OR
//		alert.dismiss();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
