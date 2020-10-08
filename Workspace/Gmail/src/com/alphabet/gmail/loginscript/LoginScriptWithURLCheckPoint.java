package com.alphabet.gmail.loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	verifying login through URL

public class LoginScriptWithURLCheckPoint extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
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
		
		
		String expectedUrl = "https://demo.actitime.com/user/submit_tt.do";
				
		
		try {					//				Handling TimeoutException
			wait.until(ExpectedConditions.urlToBe(expectedUrl));			
		} catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("URL Mismatch!");
		}
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println("Expected URL : " + expectedUrl);
		System.out.println("Actual URL : " + actualUrl);
		
		
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Home Page is Displayed");
			System.out.println("Verifying Login through URL Passed");
		}
		else {
			System.out.println("Home Page is Not Displayed");
			System.out.println("Verifying Login through WebElement Failed");
		}
		
		
		
		
//		-------------------------------------------		OR		-------------------------------------------
		
		
		
//		String expectedURL = "user/submit_tt.do";
//		
//		boolean isPassed = wait.until(ExpectedConditions.urlContains(expectedURL));
//		
//		String actualURL = driver.getCurrentUrl();
//		
//		System.out.println("Expected URL contains : " + expectedURL);
//		System.out.println("Actual URL : " + actualURL);
//		
//		if(isPassed)
//		{
//			System.out.println("Home Page is Displayed");
//			System.out.println("Verifying Login through URL Passed");
//		}
//		else
//		{
//			System.out.println("Home Page is Not Displayed");
//			System.out.println("Verifying Login through WebElement Failed");
//		}
		
		
		mySleepInSeconds(2);
		driver.close();
		
		
	}
	
}
