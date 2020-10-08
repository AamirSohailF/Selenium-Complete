package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasicSettingsTest extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		
		
	}
	
	
}
