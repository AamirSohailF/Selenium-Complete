package com.alphabet.gmail.actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ControlClickOnLinkInWebPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://jqueryui.com/draggable/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@id='menu-top']//li//a"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);	//	Key Goes to the pressed State
		
		for (WebElement link : allLinks) {
			actions.click(link);
		}
		
		actions.keyUp(Keys.CONTROL);	//	Releases the pressed Key
		actions.perform();
		
		mySleepInSeconds(8);
		
		driver.quit();
		
		
		
	}
	
}
