package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

/*
 * WAS to verify whether the alert pop up is displayed when invalid email id format is provided in the email text field of contact form in below website
								Site ------	http://www.marimallappawomenscollege.org/contactus.php?current=contactus
 */

public class HandlingAlertPopupInACollegeAppAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("http://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("name")).sendKeys("Ibrahim Lodhi");
		driver.findElement(By.name("email")).sendKeys("ibrahim");
		driver.findElement(By.name("Send")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println("Alert Message Displayed : " + alertMessage);
		alert.accept();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
