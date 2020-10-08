package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyLeftAlignment extends BasicSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int usernameStartX=username.getLocation().getX();
		int passwordStartX=password.getLocation().getX();
		
		if(usernameStartX==passwordStartX)
		{
			System.out.println("Left Alignment is Correct");
		}
		else
		{
			System.out.println("Left Alignment is Not Correct");
		}
		
	}
}
