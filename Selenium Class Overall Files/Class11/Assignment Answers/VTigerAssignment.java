package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Go to Vtiger Application and verify whether the text box is empty or not. if the textbox is not empty print the value and later clear the value and type "mohan"
											//		site url : https://demo.vtiger.com/vtigercrm/
public class VTigerAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		String usernameAttribute = username.getAttribute("value");
		System.out.println("Username 'value' Attribute : " + usernameAttribute);
		
		if (usernameAttribute.isEmpty()) {
			System.out.println("Username Textfield is Blank");
		} 
		else {
			username.sendKeys(Keys.CONTROL + "a");
			username.sendKeys(Keys.BACK_SPACE);
			username.sendKeys("mohan");
		}
		
		mySleepInSeconds(3);
		driver.close();
		
		
		
	}
	
	
}
