package com.alphabet.gmail.handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingPrintPopUp extends BasicSettings {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = setUp("https://www.selenium.dev/downloads/");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		mySleepInSeconds(3);			//			for observation
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		
		mySleepInSeconds(3);			//			for observation
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		mySleepInSeconds(5);			//			for observation
		driver.close();
		
		
	}
	
}
