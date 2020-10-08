package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CloseOnlyChildWindows extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();			//			parent window
		
		Set<String> windowIDs = driver.getWindowHandles();			//			getting all window IDs
		windowIDs.remove(parentWindow);				//			removing parent window from the set of windows
		
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
	}
	
}
