package com.alphabet.gmail.testscript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxDriver {
	public static void main(String[] args) {
		
		String firefoxKey = "webdriver.gecko.driver";
		String firefoxDriverPath = "./drivers/geckodriver.exe";
		
		System.setProperty(firefoxKey,firefoxDriverPath);
		
		FirefoxDriver driver = new FirefoxDriver();
		
	}
}
