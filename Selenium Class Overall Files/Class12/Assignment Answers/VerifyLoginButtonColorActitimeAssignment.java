package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify the login Button's Color in Actitime

public class VerifyLoginButtonColorActitimeAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		System.out.println("-------------- Using RGB value --------------");
		
		String expectedColor = "rgba(22, 108, 188, 1)";
		String actualColor = driver.findElement(By.id("loginButton")).getCssValue("color");
		System.out.println("Login Button RGB value : " + actualColor);
		if (actualColor.equals(expectedColor)) {
			System.out.println("Login Button's Color Verified through RGB value");
		} else {
			System.out.println("Login Button's Actual Color Does Not Match With Expected Color");
		}
		
		
		System.out.println();
		
		
		System.out.println("-------------- Using Hex value --------------");
		
		expectedColor = "#166cbc";
		actualColor = Color.fromString(actualColor).asHex();
		System.out.println("Login Button Hex value : " + actualColor);
		if (actualColor.equals(expectedColor)) {
			System.out.println("Login Button's Color Verified through Hex value");
		} else {
			System.out.println("Login Button's Actual Color Does Not Match With Expected Color");
		}
		
		
		
		driver.close();
		
	}
	
	
}
