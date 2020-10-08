package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class FirefoxOptionsClassForFirefoxSettings extends BasicSettings {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
