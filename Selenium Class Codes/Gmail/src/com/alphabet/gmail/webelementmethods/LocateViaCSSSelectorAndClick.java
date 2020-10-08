package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaCSSSelectorAndClick extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement passwordTB=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passwordTB.sendKeys("Mohan");
	}
}