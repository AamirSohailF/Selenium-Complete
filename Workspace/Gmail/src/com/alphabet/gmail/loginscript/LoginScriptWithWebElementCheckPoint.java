package com.alphabet.gmail.loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	verifying login through WebElement

public class LoginScriptWithWebElementCheckPoint extends BasicSettings {
		
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement usernameTB = driver.findElement(By.id("username"));
			WebElement passwordTB = driver.findElement(By.name("pwd"));
			WebElement loginButton = driver.findElement(By.id("loginButton"));
			
			
			boolean uDisplayed = usernameTB.isDisplayed();
			boolean pDisplayed = passwordTB.isDisplayed();
			boolean lDisplayed = loginButton.isDisplayed();
			
			if (uDisplayed) {
				System.out.println("Username TextBox is Displayed");
			}
			else {
				System.out.println("Username TextBox is Not Displayed");
			}
			
			
			if (pDisplayed) {
				System.out.println("Password TextBox is Displayed");
			}
			else {
				System.out.println("Password TextBox is Not Displayed");
			}
			
			
			if (lDisplayed) {
				System.out.println("Login Button is Displayed");
			}
			else {
				System.out.println("Login Button is Not Displayed");
			}
			
			usernameTB.sendKeys("admin");
			passwordTB.sendKeys("manager");
			loginButton.click();
			
			try {
			driver.findElement(By.id("logoutLink")).click();;
			System.out.println("Home Page is Displayed");
			System.out.println("Logout Button is Clicked");
			System.out.println("Verifying Login through WebElement Passed");
			}
			catch(NoSuchElementException e) {
				System.out.println("Cannot find the element you're looking for");
				System.out.println("Verifying Login through WebElement Failed");
			}
			
			mySleepInSeconds(2);
			driver.close();
		
	}
	
}
