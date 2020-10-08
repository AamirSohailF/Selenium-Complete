package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Run the Script HandlingListboxInNaukri.java on Firefox Browser and fix the issue if avalibale

public class HandlingListboxInNaukriAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/", "firefox");
		driver.findElement(By.xpath("//a//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID / Username')]")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'your password')]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
		WebElement desiredLocationLink = driver.findElement(By.linkText("Add Desired Location"));
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].click()", desiredLocationLink);
		
		mySleepInSeconds(1);
		
		WebElement desiredLocation = driver.findElement(By.id("locDroopeFor"));
		js.executeScript("arguments[0].scrollIntoView();", desiredLocation);
		
		mySleepInSeconds(1);
		desiredLocation.click();
		mySleepInSeconds(1);
		
		List<WebElement> allLocations = driver.findElements(By.xpath("//ul[@class='ChkboxEnb']//a"));
		
		mySleepInSeconds(1);
		
		for (WebElement location : allLocations) {
//			mySleepInSeconds(1);
			location.click();
			mySleepInSeconds(1);
			location.click();
		}
		
		
		mySleepInSeconds(3);
		driver.quit();
		
	}
	
}
