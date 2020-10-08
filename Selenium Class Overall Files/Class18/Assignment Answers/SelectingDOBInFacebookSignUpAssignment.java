package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Select the DOB in Facebook Web Page

public class SelectingDOBInFacebookSignUpAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select sd = new Select(day);
		Select sm = new Select(month);
		Select sy = new Select(year);
		
		//	There's no requirement of iteration hence we are not using List<WebElement> here
		
		sd.selectByVisibleText("12");
		sm.selectByVisibleText("May");
		sy.selectByVisibleText("1993");
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
