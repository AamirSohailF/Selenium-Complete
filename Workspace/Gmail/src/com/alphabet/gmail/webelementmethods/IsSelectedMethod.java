package com.alphabet.gmail.webelementmethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsSelectedMethod extends BasicSettings{

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/login.php?type=login");
		
		WebElement loginCheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		loginCheckbox.click();
		
		if (loginCheckbox.isSelected()) {
			System.out.println("Keep me logged in check box is Selected");
		}
		else {
			System.out.println("Keep me logged in check box is Not Selected");
		}
		
	}
	
	
}
