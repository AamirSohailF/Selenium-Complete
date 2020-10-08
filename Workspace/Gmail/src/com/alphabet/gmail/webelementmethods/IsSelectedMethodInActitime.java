package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsSelectedMethodInActitime extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		WebElement loggedinCheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		loggedinCheckbox.click();
		
		if (loggedinCheckbox.isSelected()) {
			System.out.println("Checkbox is Selected");
		} 
		else {
			System.out.println("Checkbox is Not Selected");
		}
		
		
	}
	
	
}
