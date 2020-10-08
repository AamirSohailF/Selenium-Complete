package com.alphabet.gmail.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingDOBInFacebookSignUp extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Asssignment Question
	}
}
