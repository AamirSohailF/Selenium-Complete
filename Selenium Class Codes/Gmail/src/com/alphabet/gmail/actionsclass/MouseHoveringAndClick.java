package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseHoveringAndClick extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.actitime.com/");
		
		WebElement clients=driver.findElement(By.linkText("Clients"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(clients).perform();
		
		
		driver.findElement(By.linkText("Healthcare")).click();
	}
}