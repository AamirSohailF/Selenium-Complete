package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingAlertPopupInACollegeApp extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("http://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		
		driver.findElement(By.name("Send")).click();
		mySleepInSeconds(1);
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		System.out.println("Alert Message Displayed is : " + alertMessage);
		
		alert.accept();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
