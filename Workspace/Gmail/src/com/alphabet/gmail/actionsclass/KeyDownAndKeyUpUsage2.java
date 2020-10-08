package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class KeyDownAndKeyUpUsage2 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		WebElement searchBox =driver.switchTo().activeElement();
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT);	//	Key Goes to the pressed State
		actions.sendKeys(searchBox,"liverpool");
//		actions.keyUp(Keys.SHIFT);	//	Releases the pressed Key					NOT CALLING KeyUp(KEYS.SHIFT) which keeps on pressing the SHIFT Button
		actions.perform();
		
		mySleepInSeconds(5);
		
		searchBox.clear();
		searchBox.sendKeys("barcelona");
		
		mySleepInSeconds(5);
		driver.close();
		
		/*
		 *	If KeyUp(...) is not called the KeyDown(...) function continues since the key called within KeyDown() is kept pressed 
		 */
		
	}
	
	
}
