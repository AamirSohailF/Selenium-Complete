package com.alphabet.gmail.handlingpopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WAS to Print the Alternate ChildBrowser Titles

public class PrintAlternateChildBrowserTitlesAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windowIDs = driver.getWindowHandles();
		windowIDs.remove(parentWindow);
		
		
		ArrayList<String> windowIDList = new ArrayList<>(windowIDs);
		
		for (int i = 0; i <= windowIDList.size(); i+=2) {
			driver.switchTo().window(windowIDList.get(i));
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		
	}
	
}
