package com.alphabet.gmail.loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LoginScript extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		boolean uDisplayed=username.isDisplayed();
		boolean pDisplayed=password.isDisplayed();
		boolean lDisplayed=loginButton.isDisplayed();
		
		if(uDisplayed)
		{
			System.out.println("Username TextBox is Displayed");
		}
		else
		{
			System.out.println("Username TextBox is Not Displayed");
		}
		
		if(pDisplayed)
		{
			System.out.println("Password TextBox is Displayed");
		}
		else
		{
			System.out.println("Password TextBox is Not Displayed");
		}
		
		if(lDisplayed)
		{
			System.out.println("LoginButton TextBox is Displayed");
		}
		else
		{
			System.out.println("LoginButton TextBox is Not Displayed");
		}
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
		mySleepInSeconds(30);
		
		String expectedTitle = "actiTIME - Enter Time-Track";
						
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Home Page is Displayed");
		}
		else
		{
			System.out.println("Home Page is Not Displayed");
		}
	}
}
