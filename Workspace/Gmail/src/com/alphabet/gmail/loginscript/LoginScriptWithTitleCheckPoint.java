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

//	verifying login through Title

public class LoginScriptWithTitleCheckPoint extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
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
		

		String expectedTitle = "actiTIME - Enter Time-Track";
		
		try {					//				Handling TimeoutException
			wait.until(ExpectedConditions.titleIs(expectedTitle));
		}
		catch(TimeoutException e) {
			System.out.println("Provided Title Not Found");
		}

		
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected Title : " + expectedTitle);	//		Not required..just to check String values
		System.out.println("Actual Title : " + actualTitle);		//		Not required..just to check String values
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Home Page is Displayed");
			System.out.println("Verifying Login through Title Passed");
		}
		else {
			System.out.println("HomePage is Not Displayed");
			System.out.println("Verifying Login through Title Failed");
		}
		
		
//		-------------------------------------------		OR		-------------------------------------------
		
		
		
//		String expectedTitle = "Enter Time-Track";
//		
//		boolean isPassed = wait.until(ExpectedConditions.titleContains(expectedTitle));
//		
//		String actualTitle = driver.getTitle();
//		
//		System.out.println("Expected Title contains : " + expectedTitle);	//		Not required..just to check String values
//		System.out.println("Actual Title : " + actualTitle);		//		Not required..just to check String values
//		
//		if (isPassed) {
//			System.out.println("Home Page is Displayed");
//			System.out.println("Verifying Login through Title Passed");
//		} else {
//			System.out.println("HomePage is Not Displayed");
//			System.out.println("Verifying Login through Title Failed");
//		}
		
		
		mySleepInSeconds(2);
		driver.close();
		
		
		
		
	}
	
}
