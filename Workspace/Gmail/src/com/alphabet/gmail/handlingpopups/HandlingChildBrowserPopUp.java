package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Script to print the windowIDs

public class HandlingChildBrowserPopUp extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		Set<String> windowIDs = driver.getWindowHandles();
		
		for (String windowID : windowIDs) {
			System.out.println(windowID);
		}
		
		System.out.println("Total number of Windows : " + windowIDs.size());
		
		driver.quit();
		
	}
	
}
