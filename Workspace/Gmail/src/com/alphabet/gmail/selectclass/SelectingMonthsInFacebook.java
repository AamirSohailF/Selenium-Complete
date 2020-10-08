package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingMonthsInFacebook extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement monthListBox = driver.findElement(By.id("month"));		
		
		Select s = new Select(monthListBox);
		
		List<WebElement> allMonth = s.getOptions();
		
		for (WebElement month : allMonth) {
			s.selectByValue(month.getAttribute("value"));
//			OR
//			s.selectByVisibleText(month.getText());
			mySleepInSeconds(1);
		}
		
		driver.close();
		
	}
	
}
