package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingSingleSelectListbox extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("file:///D:/Java%20Selenium/SCSW4/Session%2023/index.html");
		WebElement subjectsListBox=driver.findElement(By.id("single"));
		
		Select s = new Select(subjectsListBox);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
	}
}
