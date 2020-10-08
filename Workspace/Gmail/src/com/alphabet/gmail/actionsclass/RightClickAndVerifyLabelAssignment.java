package com.alphabet.gmail.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Right Click on the "Automated TestCases" cars and click on Edit Labels and verify whether Edit Labels is displayed or not

public class RightClickAndVerifyLabelAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://trello.com/login");
		Action act;
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		mySleepInSeconds(5);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		mySleepInSeconds(5);
		driver.findElement(By.id("login-submit")).click();
		String xpathForJavaSessions = "//h3[text()='Personal Boards']/../..//div[text()='My Java Sessions']";
		driver.findElement(By.xpath(xpathForJavaSessions)).click();
		
		mySleepInSeconds(5);
		
		WebElement automate100TestCases=driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));
		
		
		Actions actions = new Actions(driver);
		actions.contextClick(automate100TestCases).perform();
		
		WebElement editLabel = driver.findElement(By.xpath("//a/span[text()='Edit Labels']"));
		
		if (editLabel.isDisplayed()) {
			System.out.println("Edit Labels is Displayed...Hence the Test is Passed!");
		}
		else {
			System.out.println("Edit Labels is Not Displayed...Hence the Test is Failed!");
		}
		
		
		mySleepInSeconds(5);
		driver.close();
		
	}
	
}
