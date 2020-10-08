package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DoubleClickOnAnElement extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		
		WebElement addButton = driver.findElement(By.id("add"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(addButton).perform();
		
		
	}
	
	
}
