package com.alphabet.gmail.handlingpopups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CloseTheChildWindowsInReverseOrder extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();
		Set<String> windowIDs = driver.getWindowHandles();
		windowIDs.remove(parentWindow);
		
		System.out.println("------------------ Before Reversing ------------------");
		
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
		}
		
		System.out.println("------------------ After Reversing ------------------");
		
		ArrayList<String> windowIDsList = new ArrayList<>(windowIDs);
		Collections.reverse(windowIDsList);
		
		for (String windowID : windowIDsList) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			driver.close();
		}
	
		
	}

}
