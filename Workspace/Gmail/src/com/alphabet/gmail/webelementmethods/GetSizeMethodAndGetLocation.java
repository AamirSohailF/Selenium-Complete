package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GetSizeMethodAndGetLocation extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		WebElement username = driver.findElement(By.id("username"));
		
		
		Dimension dim = username.getSize();
		int uHeight = dim.getHeight();
		int uWidth = dim.getWidth();
		
		System.out.println("Username Textfield Height : " + uHeight);
		System.out.println("Username Textfield Width : " + uWidth);
		
		Point pt = username.getLocation();
		int uStartX = pt.getX();
		int ustartY = pt.getY();
		
		System.out.println("Username Textfield X : " + uStartX);
		System.out.println("Username Textfield Y : " + ustartY);
		
		mySleepInSeconds(1);
		driver.close();
		
	}
	
}
