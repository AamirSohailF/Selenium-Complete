package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ClearMethodToClearTextFieldContents extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Aamir");
		
		
	}
	
}
