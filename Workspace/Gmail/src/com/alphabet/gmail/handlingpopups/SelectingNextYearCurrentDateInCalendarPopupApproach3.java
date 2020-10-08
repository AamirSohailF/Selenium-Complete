package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingNextYearCurrentDateInCalendarPopupApproach3 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).sendKeys("Thu, 9 Sep, 2021");
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
