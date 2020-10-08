package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetCSSValueMethod2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		String expectedColor = "#000000";
		String actualColor= driver.findElement(By.id("username")).getCssValue("color");
		
		actualColor=Color.fromString(actualColor).asHex();
		
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
