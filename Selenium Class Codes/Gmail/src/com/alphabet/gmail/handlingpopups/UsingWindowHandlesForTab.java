package com.alphabet.gmail.handlingpopups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class UsingWindowHandlesForTab extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		mySleepInSeconds(15);//Just for understanding Purpose
		driver.close();
	}
}
