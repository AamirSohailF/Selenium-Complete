package com.alphabet.gmail.testscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {
	public static void main(String[] args) {
		String chromeKey = "webdriver.chrome.driver";
		String chromeDriverPath = "./drivers/chromedriver.exe";
		
		System.setProperty(chromeKey,chromeDriverPath);
		
		ChromeDriver driver = new ChromeDriver();
	}
}
