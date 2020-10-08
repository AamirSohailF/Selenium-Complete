package com.alphabet.gmail.actionsclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class KeyDownAndKeyUpUsage extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.google.com");
		
		WebElement searchBox=driver.findElements(By.name("q")).get(0);
	
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.SHIFT);//Key Goes to the pressed State
		actions.sendKeys(searchBox,"i love java");
			
		actions.perform();
		
		searchBox.clear();
		searchBox.sendKeys("i love selenium");
	}
}
