package com.alphabet.gmail.encapsulationtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DemoB extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		DemoA d = new DemoA(driver);
		d.setUsername("admin");
		d.setPassword("manager");
		d.clickLogin();
		
		mySleepInSeconds(10);
		driver.close();
		
	}
	
}
