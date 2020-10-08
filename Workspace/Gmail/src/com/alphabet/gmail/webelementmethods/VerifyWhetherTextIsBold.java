package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyWhetherTextIsBold extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		String expectedWeight = "700";
		
		String actualWeight = driver.findElement(By.id("adminCredentialsHeader")).getCssValue("font-weight");
		System.out.println(actualWeight);
		
		
		if (actualWeight.equals(expectedWeight)) {
			System.out.println("Pass : Its a Bold Text");
		} else {
			System.out.println("Fail : Its Not a Bold Text");
		}
		
		driver.close();
		
		
	}
	
	
}
