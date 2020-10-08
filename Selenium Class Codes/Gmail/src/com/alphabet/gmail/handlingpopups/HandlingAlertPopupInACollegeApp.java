package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingAlertPopupInACollegeApp extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("http://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("Send")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertMessage=alert.getText();
		System.out.println("Alert Message::"+alertMessage);
		
		alert.accept();
	}
}
