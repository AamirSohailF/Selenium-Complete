package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	WAS to click on Certification>Expert Level in https://www.istqb.org/

public class MouseHoveringAndClickAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.istqb.org/");
		
		WebElement certification = driver.findElement(By.linkText("Certification"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(certification).perform();
		
		driver.findElement(By.xpath("//div[@class='mega-dropdown-inner']//li//a[text()='Expert Level ']")).click();
		
		
	}
	
}
