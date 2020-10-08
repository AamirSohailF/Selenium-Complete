package com.alphabet.gmail.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser
{
	public static void main(String[] args) 
	{
		//Set the driver executable path for chrome browser
		String chromeKey="webdriver.chrome.driver";
		String chromeDriverPath = "./drivers/chromedriver.exe";
		System.setProperty(chromeKey,chromeDriverPath);
		
		ChromeDriver driver = new ChromeDriver();
	}
}
