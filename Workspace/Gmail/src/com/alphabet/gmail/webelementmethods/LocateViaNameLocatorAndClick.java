package com.alphabet.gmail.webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaNameLocatorAndClick extends BasicSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			//		Implicit wait
		
		driver.get("https://www.skillrary.com/");
		
//		Thread.sleep(5000);
		
		WebElement popUp = driver.findElement(By.className("close"));
		popUp.click();
		
		
		WebElement searchTB=driver.findElement(By.name("q"));
		searchTB.sendKeys("Django");
		
	}
}
