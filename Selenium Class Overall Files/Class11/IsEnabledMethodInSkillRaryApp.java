package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsEnabledMethodInSkillRaryApp extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/");
		System.out.println(driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled());
		driver.close();
	}
}
