package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ChromeOptionsClassForSettings extends BasicSettings
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com");
	}
}
