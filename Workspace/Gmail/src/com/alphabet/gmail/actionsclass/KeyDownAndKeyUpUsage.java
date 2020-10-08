package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class KeyDownAndKeyUpUsage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		WebElement searchBox =driver.switchTo().activeElement();
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT);	//	Key Goes to the pressed State
		actions.sendKeys(searchBox,"liverpool");
		actions.keyUp(Keys.SHIFT);	//	Releases the pressed Key
		actions.perform();
		
		mySleepInSeconds(5);
		
		searchBox.clear();
		searchBox.sendKeys("barcelona");
		
		mySleepInSeconds(5);
		driver.close();
		
		
	}
	
	
}
