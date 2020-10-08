package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetAttributeMethod extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com");
		String attValue= driver.findElement(By.id("email")).getAttribute("type");
		System.out.println(attValue);
	}
}
