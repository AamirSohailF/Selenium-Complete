package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SubmitToClickOnAButton3 extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("chrome","https://www.facebook.com");
		
		driver.findElement(By.id("u_0_2")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
}
