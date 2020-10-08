package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Right click on a specific location (x and y cordinate) of a webpage using Actions Class

public class RightClickAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		Actions actions = new Actions(driver);
		actions.moveByOffset(1044, 396).contextClick().perform();
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
