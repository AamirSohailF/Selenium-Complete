package com.alphabet.gmail.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingSingleSelectListbox2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("file:///D:/Java%20Selenium/SCSW4/Session%2023/index.html");
		WebElement subjectsListBox=driver.findElement(By.id("single"));
		
		Select s = new Select(subjectsListBox);
		WebElement currentOption=s.getFirstSelectedOption();//currently selected Option in the list box
		System.out.println(currentOption.getText());
		
		s.selectByIndex(4);
		
		currentOption=s.getFirstSelectedOption();//currently selected Option in the list box
		System.out.println(currentOption.getText());
		
		driver.close();
	}
}