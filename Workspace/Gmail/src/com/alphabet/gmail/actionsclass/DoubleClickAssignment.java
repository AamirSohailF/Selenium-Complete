package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WAS to click on minus Button in https://live.skillrary.com/testing-app/product.php?product=selenium-training

public class DoubleClickAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		
		WebElement add = driver.findElement(By.id("add"));
		WebElement minus = driver.findElement(By.id("minus"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(add).doubleClick();
		actions.moveToElement(add).doubleClick();
		actions.moveToElement(minus).doubleClick();
		actions.perform();
		
		
	}
	
	
}
