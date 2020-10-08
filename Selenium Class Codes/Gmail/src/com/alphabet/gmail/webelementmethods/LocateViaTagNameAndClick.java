package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaTagNameAndClick extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement firstLink=driver.findElement(By.tagName("a"));
		firstLink.click();
	}
}