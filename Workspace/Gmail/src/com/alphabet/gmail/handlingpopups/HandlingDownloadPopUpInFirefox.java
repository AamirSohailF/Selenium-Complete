package com.alphabet.gmail.handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingDownloadPopUpInFirefox extends BasicSettings {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = setUp("https://www.selenium.dev/downloads/", "firefox");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_S);
		
		mySleepInSeconds(5);			//			for observation
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		mySleepInSeconds(5);			//			for observation
		driver.close();
		
		
	}
	
}
