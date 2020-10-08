package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SubmitToClickOnAButton extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("chrome","https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
}
