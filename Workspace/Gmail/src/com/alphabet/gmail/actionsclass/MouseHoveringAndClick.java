package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseHoveringAndClick extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.actitime.com/");
		
		WebElement industries = driver.findElement(By.xpath("//li[text()='Industries']"));
		
		Actions actions = new Actions(driver);
		actions.click(industries).perform();
		
		driver.findElement(By.linkText("Healthcare")).click();
		
	}
	
	
}
