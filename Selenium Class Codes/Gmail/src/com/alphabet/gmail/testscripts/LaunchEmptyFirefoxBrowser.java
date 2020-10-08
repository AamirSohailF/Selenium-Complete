package com.alphabet.gmail.testscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser 
{
	public static void main(String[] args) 
	{
		String firefoxKey="webdriver.gecko.driver";
		String firefoxPath="./drivers/geckodriver.exe";
		System.setProperty(firefoxKey, firefoxPath);
		
		FirefoxDriver driver = new FirefoxDriver();
	}
}
