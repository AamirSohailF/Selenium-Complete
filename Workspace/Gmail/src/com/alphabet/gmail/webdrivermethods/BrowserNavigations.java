package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.facebook.com/");
		nav.back();
		nav.forward();
		nav.refresh();
		
		driver.close();
		
	}
}
