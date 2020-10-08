package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingCalendarPopup extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		mySleepInSeconds(1);			//			for observation
		driver.findElement(By.xpath("//span[text()='September']/../../..//a[text()='25']")).click();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
