package com.alphabet.gmail.handlingpopups;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WAS to Select the current Date using sendkeys with the help of LocaDateTime Methods in cleartrip.com

public class SelectingCurrentDateUsingSendKeysAndLDTInCalendarPopupAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		int day = ldt.getDayOfMonth();
		
		String month = ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		
		int year = ldt.getYear();
		
		System.out.println(day);				//			for reference
		System.out.println(month);				//			for reference
		System.out.println(year);				//			for reference
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		WebElement deptDateField = driver.findElement(By.id("DepartDate"));
		
		deptDateField.sendKeys("Wed, " + day + " " + month + ", " + year );
		
		mySleepInSeconds(5);
		driver.close();
		
		
	}
	
}
