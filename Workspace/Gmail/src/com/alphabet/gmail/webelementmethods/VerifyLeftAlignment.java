package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyLeftAlignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int usernameStartX = username.getLocation().getX();
		int passwordStartX = username.getLocation().getX();
		
		
		System.out.println("Username Textfield Left Allignment X value : " + usernameStartX);		//		just to ensure the values of username X and password X
		System.out.println("Password Textfield Left Allignment X value : " + passwordStartX);		//		just to ensure the values of username X and password X
		
		if (usernameStartX == passwordStartX) {
			System.out.println("Username and Password textfields Left Allignment is Correct");
		} 
		else {
			System.out.println("Username and Password textfields Left Allignment is Wrong");
		}
		
		mySleepInSeconds(2);
		driver.close();
		
		
	}
	
	
}
