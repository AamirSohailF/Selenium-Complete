package com.alphabet.gmail.handlingpopups;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TakesScreenShotInCaseOfMultipleWindows extends BasicSettings {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		mySleepInSeconds(15);			//			for observation
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/actitimelogin.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		/*
		 * 	Since the driver control is not switched and it lies in the login page of Actitime hence, TakesScreenshot automatically takes care
		 * 	of switching and capturing the screenshot of the page. 
		 */
		
		
		mySleepInSeconds(5);
		driver.quit();
	}
	
}
