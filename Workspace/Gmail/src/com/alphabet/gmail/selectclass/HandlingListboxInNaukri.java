package com.alphabet.gmail.selectclass;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingListboxInNaukri extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		driver.findElement(By.xpath("//a//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID / Username')]")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'your password')]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
		WebElement desiredLocationLink = driver.findElement(By.linkText("Add Desired Location"));
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].click()", desiredLocationLink);
		
		
		driver.findElement(By.id("locDroopeFor")).click();
		
		List<WebElement> allLocations = driver.findElements(By.xpath("//ul[@class='ChkboxEnb']//a"));
		
		mySleepInSeconds(1);
		
		for (WebElement location : allLocations) {
			location.click();
			mySleepInSeconds(1);
			location.click();
		}
		
		
		mySleepInSeconds(3);
		driver.quit();
		
	}
	
}
