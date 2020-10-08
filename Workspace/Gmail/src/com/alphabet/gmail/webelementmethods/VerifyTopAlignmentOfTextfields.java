package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyTopAlignmentOfTextfields extends BasicSettings {

	public static void main(String[] args) {
		
		final int standardSpace = 5 ;
		
		WebDriver driver = setUp();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		
		int passwordStartY = password.getLocation().getY();
//		System.out.println("Password start y : " + passwordStartY);
		
		
		Rectangle rect = username.getRect();
		
		
		int usernameStartY = rect.getY();
		int usernameHeight = rect.getHeight();
//		System.out.println("Username start y : " + usernameStartY);
//		System.out.println("Username height : " + usernameHeight);
		
		
		int usernameEndY = usernameStartY + usernameHeight;
//		System.out.println("Username end y : " + usernameEndY);
		
		
		int space = passwordStartY - usernameEndY ;
		System.out.println("Space : " + space);		//		to know the site's actual space
		
		
		int usernameEndYWithSpace = usernameEndY + space ;
		
		if (passwordStartY >= usernameEndYWithSpace && space == standardSpace) {
			System.out.println("Top Allignment Successful");
		} else {
			System.out.println("Top Allignment Failed");
		}
		
		
		driver.close();
		
		
	}
	
	
	
}
