package com.alphabet.gmail.loginscript;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TestOverall extends BasicSettings {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		System.out.println("--------------------- Login Test through Title (Type 1) ---------------------");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		try {
			wait.until(ExpectedConditions.titleIs(expectedTitle));
		} 
		
		catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("Expected Title differ from Actual Title");
		}
		
		
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected title : " + expectedTitle);
		System.out.println("Actual title : " + actualTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Test Type 1 Pass!");
		} else {
			System.out.println("Title Test Type 1 Fail!");
		}
		
		


		driver.findElement(By.id("logoutLink")).click();

		System.out.println("--------------------- Login Test through Title (Type 2) ---------------------");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		expectedTitle = "Time-Track";
		
		boolean isPass = wait.until(ExpectedConditions.titleContains(expectedTitle));
		
		actualTitle = driver.getTitle();
		
		System.out.println("Expected Title Contains : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		if (isPass) {
			System.out.println("Title Test Type 2 Pass");
		} else {
			System.out.println("Title Test Type 2 Fail");
		}
		
		
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("--------------------- Login Test through URL (Type 1) ---------------------");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedURL = "https://demo.actitime.com/user/submit_tt.do";
				
		
		try {					//				Handling TimeoutException
			wait.until(ExpectedConditions.urlToBe(expectedURL));
		} catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("URL Mismatch!");
		}
		
		
		String actualURL = driver.getCurrentUrl();
		
		System.out.println("Expected URL : " + expectedURL);
		System.out.println("Actual URL : " + actualURL);
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL Test Type 1 Pass");
		} else {
			System.out.println("URL Test Type 1 Fail");
		}
		
		
		
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("--------------------- Login Test through URL (Type 2) ---------------------");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		expectedURL = "user/submit_tt.do";
		
		boolean isPassed = wait.until(ExpectedConditions.urlContains(expectedURL));
		
		actualURL = driver.getCurrentUrl();
		
		System.out.println("Expected URL Contains : " + expectedURL);
		System.out.println("Actual URL : " + actualURL);
		
		if (isPassed) {
			System.out.println("URL Test Type 2 Pass");
		} else {
			System.out.println("URL Test Type 2 Fail");
		}
		
		
		
		mySleepInSeconds(2);
		driver.close();
		
	}


	
}
