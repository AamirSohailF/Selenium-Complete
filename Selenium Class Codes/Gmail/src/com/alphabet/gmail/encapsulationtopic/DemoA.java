package com.alphabet.gmail.encapsulationtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoA
{
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	
	public DemoA(WebDriver driver) 
	{
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));			
	}
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String passd)
	{
		password.sendKeys(passd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
}
