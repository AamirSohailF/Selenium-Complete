package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseHoveringAndClick2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.selenium.dev/");
		
		WebElement about=driver.findElement(By.linkText("About"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(about).click().perform();
		
		
		driver.findElement(By.linkText("Ecosystem")).click();
	}
}
