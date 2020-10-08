package com.alphabet.gmail.handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PerformActionNewTab extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		String expectedWindowTitle="actiTIME - Time Tracking Software for Boosting Your Business";
		
		Set<String> windowIds=driver.getWindowHandles();
		for(String windowId:windowIds)
		{
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals(expectedWindowTitle))
			{
				break;
			}
		}
		
		WebElement pricing=driver.findElement(By.linkText("Pricing"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", pricing);
		
		
		driver.quit();
	}
}
