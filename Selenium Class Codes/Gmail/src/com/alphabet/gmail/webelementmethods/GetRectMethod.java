package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetRectMethod extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		WebElement username = driver.findElement(By.id("username"));
		Rectangle rect = username.getRect();
		
		int height = rect.getHeight();
		int width = rect.getWidth();
		
		System.out.println("The Height="+height);
		System.out.println("The Width="+width);
		
		int startX = rect.getX();
		int startY = rect.getY();
		
		System.out.println("The startX="+startX);
		System.out.println("The startY="+startY);
	}
}
