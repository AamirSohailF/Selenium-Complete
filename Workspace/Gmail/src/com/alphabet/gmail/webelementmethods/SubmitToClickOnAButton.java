package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SubmitToClickOnAButton extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
	}
	
	
}
/* -------------------------------	IMPORTANT -------------------------------
	1. form Element
	2. type should be submit
	3. Enter the all the mandatory information before using submit method
	4. submit method is a programmatic click
*/