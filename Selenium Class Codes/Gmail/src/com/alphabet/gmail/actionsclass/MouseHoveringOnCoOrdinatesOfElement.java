package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseHoveringOnCoOrdinatesOfElement extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.actitime.com/");
		
		WebElement features=driver.findElement(By.linkText("Features"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(features,100,0).perform();
	}
}
