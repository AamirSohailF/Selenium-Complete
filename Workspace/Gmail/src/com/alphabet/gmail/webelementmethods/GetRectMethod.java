package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetRectMethod extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		WebElement username = driver.findElement(By.id("username"));
		Rectangle rect = username.getRect();
		
		
		int uHeight = rect.getHeight();
		int uWidth = rect.getWidth();
		
		System.out.println("Username Textfield Height : " + uHeight);
		System.out.println("Username Textfield Width : " + uWidth);
		
		
		int uStartX = rect.getX();
		int uStartY = rect.getY();
		
		System.out.println("Username Textfield X : " + uStartX);
		System.out.println("Username Textfield Y : " + uStartY);
		
		mySleepInSeconds(1);
		driver.close();
		
	}
	
}
