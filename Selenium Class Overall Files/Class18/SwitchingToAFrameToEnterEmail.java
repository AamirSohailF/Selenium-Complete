package com.alphabet.gmail.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SwitchingToAFrameToEnterEmail extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://app.kickofflabs.com/landing-page-templates");
				
		driver.switchTo().frame("theme-preview-iframe");
		
		driver.findElement(By.id("email")).sendKeys("nameishemanth@gmail.com");

	}
}
