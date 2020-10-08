package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyTopAlignmentOfTextfields extends BasicSettings
{
	public static void main(String[] args) 
	{
		final int STANDARD_SPACE = 6;
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int passwordStartY = password.getLocation().getY();
		
		Rectangle rect = username.getRect();
		
		int usernamestartY = rect.getY();
		int usernameHeight = rect.getHeight();
		
		int usernameEndY = usernamestartY+usernameHeight;
		int space = passwordStartY - usernameEndY;
		System.out.println(space);
		
		int usernameEndYWithSpace = usernameEndY+space;
		
		if(passwordStartY>=usernameEndYWithSpace && space==STANDARD_SPACE)
		{
			System.out.println("Top Alignment is Correct");
		}
		else
		{
			System.out.println("Top Alignment is Not Correct");
		}
		
		driver.close();
	}
}
