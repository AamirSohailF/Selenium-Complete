package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaCSSSelectorAndSendKeys extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userTB = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number\']"));
		userTB.sendKeys("carryminati@business.com");
		
		
		WebElement passwordTB = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passwordTB.sendKeys("carryislive");
		
	}
	
	
}
