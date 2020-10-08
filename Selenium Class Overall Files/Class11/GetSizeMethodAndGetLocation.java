package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetSizeMethodAndGetLocation extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		WebElement username = driver.findElement(By.id("username"));
		Dimension dim = username.getSize();
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("The Height="+height);
		System.out.println("The Width="+width);
		
		Point pt =username.getLocation();
		int startX = pt.getX();
		int startY = pt.getY();
		
		System.out.println("The startX="+startX);
		System.out.println("The startY="+startY);
	}
}
