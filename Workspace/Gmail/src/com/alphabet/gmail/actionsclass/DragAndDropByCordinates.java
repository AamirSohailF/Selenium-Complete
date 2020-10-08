package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DragAndDropByCordinates extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		mySleepInSeconds(5);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		mySleepInSeconds(5);
		driver.findElement(By.id("login-submit")).click();
		String xpathForJavaSessions = "//h3[text()='Personal Boards']/../..//div[text()='My Java Sessions']";
		driver.findElement(By.xpath(xpathForJavaSessions)).click();
		
		mySleepInSeconds(5);
		
		WebElement source=driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));

		mySleepInSeconds(5);
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(source, 0, 500).perform();
	}
}
