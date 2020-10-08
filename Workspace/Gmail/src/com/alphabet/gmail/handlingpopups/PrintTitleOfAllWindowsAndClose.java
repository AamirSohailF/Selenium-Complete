package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PrintTitleOfAllWindowsAndClose extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		Set<String> windowIDs = driver.getWindowHandles();
		
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		System.out.println("Total number of Windows : " + windowIDs.size());
		
	}
	
}
