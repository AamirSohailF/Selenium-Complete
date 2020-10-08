package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaNameLocatorAndClick extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		
		WebElement popUp = driver.findElement(By.className("close"));
		popUp.click();
		
		
		WebElement searchTB=driver.findElement(By.name("q"));
		searchTB.sendKeys("JavaScript");
	}
}
