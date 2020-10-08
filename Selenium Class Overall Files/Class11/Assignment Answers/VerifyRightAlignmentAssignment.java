package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//			Q.	Verify whether the right alignment of the username and password text fields is correct or not in Actitime

public class VerifyRightAlignmentAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		
		Rectangle urect = username.getRect();
		Rectangle prect = password.getRect();
		
		
		int usernameStartX = urect.getX();
		int usernameWidth = urect.getWidth();
		int usernameEndX = usernameStartX + usernameWidth ;
		
		int passwordStartX = prect.getX();
		int passwordWidth = prect.getWidth();
		int passwordEndX = passwordStartX + passwordWidth ;
		
		if (usernameEndX == passwordEndX) {
			System.out.println("Username and Password Textfields Right Allignment Successful");
		} else {
			System.out.println("Username and Password Textfields Right Allignment Failed");
		}
		
		driver.close();
		
		
		
	}
	
	
}
