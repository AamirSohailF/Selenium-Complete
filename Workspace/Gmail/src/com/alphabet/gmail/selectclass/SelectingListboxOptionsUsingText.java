package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingListboxOptionsUsingText extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:///E:/QSpiders/Selenium/Selenium%20Class%20Overall%20Files/Class18/index.html");
		
		WebElement subjectsListBox = driver.findElement(By.id("single"));
		
		Select s = new Select(subjectsListBox);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement option : allOptions) {
			s.selectByVisibleText(option.getText());
			mySleepInSeconds(1);
		}
		
		driver.close();
		
	}
	
}
