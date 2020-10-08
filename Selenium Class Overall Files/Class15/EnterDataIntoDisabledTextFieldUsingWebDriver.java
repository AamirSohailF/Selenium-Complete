package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class EnterDataIntoDisabledTextFieldUsingWebDriver extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("mohan");	
	}
}
//Selenium WebDriver commands wont work on Disabled Elements 