package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Select the Months of Facebook Month List Box except the default text 'Month'

public class IteratingMonthInFacebookAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement monthListBox =driver.findElement(By.id("month"));
		
		Select s = new Select(monthListBox);
		
		List<WebElement> allMonths = s.getOptions();
		
		for (WebElement month : allMonths) {
			if (!(month.getText().equals("Month"))) {
				s.selectByVisibleText(month.getText());
				mySleepInSeconds(1);				
			}
		}
		
		driver.close();
		
		
	}
	
}
