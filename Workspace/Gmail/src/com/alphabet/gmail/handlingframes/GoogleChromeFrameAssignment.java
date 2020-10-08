package com.alphabet.gmail.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Go to the Chrome Browser and select Youtube from Google Apps Menu and verify Youtube Page title.

public class GoogleChromeFrameAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("YouTube")).click();
		
		String title = driver.getTitle();
		System.out.println("Title --- " + title);
		
//		OR
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = (String) js.executeScript("return document.title");
//		System.out.println("Title ::: " + title);
		
		mySleepInSeconds(3);
		driver.close();
	
		
		
	}
	
}
