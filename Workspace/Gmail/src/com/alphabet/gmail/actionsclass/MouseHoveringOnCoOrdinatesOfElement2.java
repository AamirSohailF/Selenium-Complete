package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseHoveringOnCoOrdinatesOfElement2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = setUp("https://www.selenium.dev/");
		
		WebElement documentationLink = driver.findElement(By.linkText("Documentation"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(documentationLink, 100, 0).click().perform();		/*		from the center of the given
																						element it revolves around the coordinates provided */
		
		
	}
}
