package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingMultiSelectListbox extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:///E:/QSpiders/Selenium/Selenium%20Class%20Overall%20Files/Class18/index.html");
		
		WebElement dishesListBox = driver.findElement(By.id("multi"));
		
		Select s = new Select(dishesListBox);
		
		if (s.isMultiple()) {
			System.out.println("It is a Multiple ListBox");
		}
		else {
			System.out.println("It is a Single ListBox");
		}
		
		List<WebElement> allOptions = s.getOptions();
		
		for (int i = 0; i < allOptions.size(); i++) {		//		selecting all dishes
			s.selectByIndex(i);
			mySleepInSeconds(1);
		}
		
		for (int i = 0; i < allOptions.size(); i++) {		//		deselecting all dishes
			s.deselectByIndex(i);
			mySleepInSeconds(1);
		}
		
		driver.close();
		
	}
	
}
