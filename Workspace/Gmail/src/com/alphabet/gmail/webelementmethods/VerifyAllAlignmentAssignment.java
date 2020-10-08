package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//		Q.	Verify whether the all the alignment of username and password text field is correct or not in Actitime
public class VerifyAllAlignmentAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		Rectangle urect = username.getRect();
		Rectangle prect = password.getRect();
		
		int usernameHeight = urect.getHeight();
		int usernameWidth = urect.getWidth();
		int usernameStartX = urect.getX();
		int usernameStartY = urect.getY();
		
		
		int passwordHeight = prect.getHeight();
		int passwordWidth = prect.getWidth();
		int passwordStartX = prect.getX();
		int passwordStartY = prect.getY();
		
		
		System.out.println("------------ Verifying Left Allignment ------------");
		if (usernameStartX == passwordStartX) {
			System.out.println("Username and Password Left Allignment Successful");
		} else {
			System.out.println("Username and Password Left Allignment Failed");
		}
		
		
		System.out.println();
		
		
		System.out.println("------------ Verifying Right Allignment ------------");
		int  usernameEndX = usernameStartX + usernameWidth ;
		
		int passwordEndX = passwordStartX + passwordWidth ;
		
		if (usernameEndX == passwordEndX) {
			System.out.println("Username and Password Right Allignment Successful");
		} 
		else {
			System.out.println("Username and Password Right Allignment Failed");
		}
		
		
		System.out.println();
		
		
		System.out.println("------------ Verifying Top Allignment ------------");
		final int standardSpace = 5 ;
		
		int usernameEndY = usernameStartY + usernameHeight ;
		
		int space = passwordStartY - usernameEndY ;	
//		System.out.println(space);
		
		int usernameEndYWithSpace = usernameEndY + space ;
		
		if (passwordStartX >= usernameEndYWithSpace && space == standardSpace) {
			System.out.println("Username and Password Top Allignment Successful");
		} 
		else {
			System.out.println("Username and Password Top Allignment Failed");
		}
		
		
		driver.close();
		
	}
	
	
}
