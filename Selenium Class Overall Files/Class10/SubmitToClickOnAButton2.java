package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SubmitToClickOnAButton2 extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).submit();
	}
}
//1. form Element
//2. type should be submit
//3. Enter the all the mandatory information before using submit method
//4. submit method is a programmatic click