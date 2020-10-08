package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify the Error Message Color in Actitime 

public class VerifyErrorMessageColorActitimeAssignment extends BasicSettings{

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		driver.findElement(By.id("loginButton")).click();
		
		String actualColor = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getCssValue("color");
		
		
		System.out.println("-------- Using RGB value -------- ");
		String expectedColor = "rgba(206, 1, 0, 1)";
		System.out.println("Error Message RGB Value : " + actualColor);
		
		if (actualColor.equals(expectedColor)) {
			System.out.println("Error Message Color Verified Using RGB Values");
		} else {
			System.out.println("Error Message Color Verification Failed Using RGB Values");
		}
		
		System.out.println();
		
		System.out.println("-------- Using Hex value -------- ");
		expectedColor = "#ce0100";
		actualColor = Color.fromString(actualColor).asHex();
		System.out.println("Error Message Hex Value : " + actualColor);
		
		if (actualColor.equals(expectedColor)) {
			System.out.println("Error Message Color Verified Using Hex Value");
		} else {
			System.out.println("Error Message Color Verification Failed Using Hex Value");
		}
		
		
		driver.close();
		
	}
	
	
}
