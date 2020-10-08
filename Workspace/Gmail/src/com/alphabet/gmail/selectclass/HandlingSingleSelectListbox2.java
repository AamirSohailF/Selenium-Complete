package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingSingleSelectListbox2 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("file:///E:/QSpiders/Selenium/Selenium%20Class%20Overall%20Files/Class18/index.html");
		
		WebElement subjectsListBox = driver.findElement(By.id("single"));
		
		Select s = new Select(subjectsListBox);
		List<WebElement> allOptions = s.getOptions();
		
		WebElement currentOption = s.getFirstSelectedOption();
		System.out.println("Option Selected When Page Loads : " + currentOption.getText());
		
		s.selectByIndex(4);
		
		currentOption = s.getFirstSelectedOption();
		System.out.println("Option Selected After Setting Another Index : " + currentOption.getText());
		
		mySleepInSeconds(1);
		driver.close();
		
	}
	
}
