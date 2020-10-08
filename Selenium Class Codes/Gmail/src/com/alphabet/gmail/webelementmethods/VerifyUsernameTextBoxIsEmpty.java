package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyUsernameTextBoxIsEmpty extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("mohan");
		
		String attValue=username.getAttribute("subhrajit");
		if(attValue!=null)
		{
			if(attValue.isEmpty())
			{
				System.out.println("Username text box is empty");
			}
			else
			{
				System.out.println("Username text box is Not empty");
				System.out.println(attValue);
			}
		}
		else
		{
			System.out.println("Attribute is Not Present");
		}
		
	}
}
