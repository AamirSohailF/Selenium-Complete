package com.alphabet.gmail.testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TC020 extends BasicSettings {		//		Assertion Success

	@Test
	public void testValidLogin()
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		boolean actual = wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		Assert.assertEquals(actual, true);		/*		if assertion is equal the code continues to execute.
		 												if Assertion fails the code stops there and then  */
		Reporter.log("Assertion Successful", true);
		mySleepInSeconds(5);
		driver.close();
		
		
		
	}
	
}