package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SwitchToWindowMethodUsingNames extends BasicSettings {

	public static void main(String[] args) {
		
		/*
		 * 		Identify names of tabs by typing ---	window.name   --- in the respective tab's console		
		 */
		
		WebDriver driver = setUp("https://www.naukri.com/");
		String [] windowNames = {"1", "2", "3"};			//			Tab Names stored in an array
		
		//		CLOSING CHILD TABS
		for (String windowName : windowNames) {				//		iterating over the array
			driver.switchTo().window(windowName);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		
		//		CLOSING PARENT TAB
		driver.switchTo().window("");			//			to close naukri's homepage. "" because naukri's homepage has name which is an empty string
		driver.close();
		
	}
	
}
