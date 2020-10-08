package com.alphabet.gmail.handlingpopups;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WAS to Select Next Week's Date in Calendar Popup of Cleartrip.com

public class SelectingNextWeeksDateInCalendarPopupAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now().plusWeeks(1);
		
		int day = ldt.getDayOfMonth();
		
		String month = ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		
		String year = ldt.getYear() + "";
		
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		mySleepInSeconds(1);			//			for observation
		
		String cXpath = "//span[text()='" + year + "']/..//span[text()='" + month + "']/../../..//a[text()='" + day + "']";
		
		driver.findElement(By.xpath(cXpath)).click();
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
