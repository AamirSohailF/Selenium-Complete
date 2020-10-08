package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class FirefoxOptionsClassFOrFirefoxSettings extends BasicSettings	
{
	public static void main(String[] args) 
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://www.cleartrip.com/");
	}
}
