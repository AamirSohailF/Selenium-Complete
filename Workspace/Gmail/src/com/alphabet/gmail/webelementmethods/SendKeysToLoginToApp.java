package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SendKeysToLoginToApp extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		
		
	}
	
}
