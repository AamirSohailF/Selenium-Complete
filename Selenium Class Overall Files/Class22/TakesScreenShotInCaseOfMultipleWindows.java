package com.alphabet.gmail.handlingpopups;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TakesScreenShotInCaseOfMultipleWindows extends BasicSettings 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		mySleepInSeconds(15);//Just for understanding Purpose
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("./errorshots/sample.png");
		FileUtils.copyFile(src, dest);
	}
}
