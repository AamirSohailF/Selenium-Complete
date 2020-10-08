package com.alphabet.gmail.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Test Valid Login

public class TC001 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
		
//		OR
		
//		WebDriver driver = setUp();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = lp.login("admin", "manager");
		
		if (hp.verifyPageTitle("actiTIME - Enter Time-Track")) {
			System.out.println("Home Page is Displayed");
		}
		else {
			System.out.println("Home Page is Not Displayed");
		}
		
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
