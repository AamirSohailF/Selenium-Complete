package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class RightClickOnElement extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.google.com");
		
		WebElement searchField=driver.findElement(By.name("q"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(searchField).perform();
	}
}
