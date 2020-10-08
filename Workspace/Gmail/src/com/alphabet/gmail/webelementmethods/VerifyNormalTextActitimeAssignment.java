package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify whether "Please identify yourself" is a Normal Text in Actitime

public class VerifyNormalTextActitimeAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		String fontSize = driver.findElement(By.id("headerContainer")).getCssValue("font-weight");
//		System.out.println(fontSize);
		
		if (fontSize.equals("400")) {
			System.out.println("'Please identify yourself' is a Normal Text");
		}
		else {
			System.out.println("'Please identify yourself' is Not a Normal Text");
		}
		
		
		driver.close();
	}
	
	
}
