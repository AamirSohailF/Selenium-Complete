package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsSelectedMethodInFacebook extends BasicSettings
{
	public static void main(String[] args) 
	{		
		WebDriver driver = setUp("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		String maleXpath = "//label[text()='Male']/..//input[@name='sex']";
		WebElement rememberCheckbox = driver.findElement(By.xpath(maleXpath));
		rememberCheckbox.click();
		
		if(rememberCheckbox.isSelected())
		{
			System.out.println("Checkbox is Selected");
		}
		else
		{
			System.out.println("Checkbox is Not Selected");
		}
	}
}