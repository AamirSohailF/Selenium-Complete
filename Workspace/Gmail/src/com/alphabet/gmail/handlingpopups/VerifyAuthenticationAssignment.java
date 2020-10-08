package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify Whether Authentication was successfull

public class VerifyAuthenticationAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		boolean basicAuthDisplay = driver.findElement(By.xpath("//h3[.='Basic Auth']")).isDisplayed();
		
		if (basicAuthDisplay) {
			System.out.println("Authentication Passed..");
		}
		else {
			System.out.println("Authentication Failed..");
		}
		
		
		mySleepInSeconds(5);
		driver.close();
	}
	
}
