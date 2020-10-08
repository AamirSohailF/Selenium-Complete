package com.alphabet.gmail.handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingNotificationPopUp extends BasicSettings {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		mySleepInSeconds(5);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		mySleepInSeconds(2);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		mySleepInSeconds(2);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		mySleepInSeconds(2);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		mySleepInSeconds(3);
		driver.close();
	}
	
}
