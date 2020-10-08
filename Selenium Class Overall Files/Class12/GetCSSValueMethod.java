package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetCSSValueMethod extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		String expectedColor = "rgba(0, 0, 0, 1)";
		String actualColor= driver.findElement(By.id("username")).getCssValue("color");
		System.out.println(actualColor);
		if(actualColor.equals(expectedColor))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
