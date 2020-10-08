package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class RightClick extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
