package com.alphabet.gmail.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingListboxApproach2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("file:///D:/Java%20Selenium/SCSW4/Session%2023/index.html");
		driver.findElement(By.id("single")).click();
		driver.findElement(By.xpath("//option[text()='Manual']")).click();	
	}
}
