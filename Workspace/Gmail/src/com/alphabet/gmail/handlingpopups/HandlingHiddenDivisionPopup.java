package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingHiddenDivisionPopup extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://en.wikipedia.org/wiki/India");
		
		WebElement indusValleyCivilisationText = driver.findElement(By.linkText("Indus Valley Civilisation"));
		
		
		mySleepInSeconds(10);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(indusValleyCivilisationText).perform();
		
		driver.findElement(By.className("mwe-popups-settings-icon']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
//		driver.findElement(By.className("mwe-popups-settings-icon")).click();
//		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
