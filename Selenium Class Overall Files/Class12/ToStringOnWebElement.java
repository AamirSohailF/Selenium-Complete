package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ToStringOnWebElement extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		String str = driver.findElement(By.id("username")).toString();
		System.out.println(str);
		driver.close();
	}
}
