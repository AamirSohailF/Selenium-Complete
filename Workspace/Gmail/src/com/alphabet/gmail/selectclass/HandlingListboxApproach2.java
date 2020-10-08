package com.alphabet.gmail.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingListboxApproach2 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:///E:/QSpiders/Selenium/Selenium%20Class%20Overall%20Files/Class18/index.html");
		driver.findElement(By.id("single"));
		mySleepInSeconds(2);				//		for observation
		driver.findElement(By.xpath("//option[text()='SQL']")).click();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
