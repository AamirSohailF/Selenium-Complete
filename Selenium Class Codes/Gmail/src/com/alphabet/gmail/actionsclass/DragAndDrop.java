package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DragAndDrop extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block1,block4).perform();
	}
}
