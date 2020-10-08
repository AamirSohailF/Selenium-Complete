package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SendKeysToClearTextFieldContents extends BasicSettings
{
	public static void main(String[] args) 
	{

		WebDriver driver = setUp("chrome","https://demo.vtiger.com/vtigercrm/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.DELETE);
	}
}
