package com.alphabet.gmail.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SwitchingToAFrameToEnterEmail extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://app.kickofflabs.com/landing-page-templates");
		
		driver.switchTo().frame("theme-preview-iframe");		//		initially searches the frame by the name for the given implicit time..if not found then it goes for the passed id
		//	this changes the frame
		
		driver.findElement(By.id("email")).sendKeys("aamir0105@gmail.com");
		
		mySleepInSeconds(3);
		driver.close();
		
	}
	
}
