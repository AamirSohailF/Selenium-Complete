package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsSelectedMethodInFacebook extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@name='sex']"));
		maleRadioButton.click();
		
		if (maleRadioButton.isSelected()) {
			System.out.println("Male Radio Button is Selected");
		} else {
			System.out.println("Male Radio Button is Not Selected");
		}
		
		
	}
	
	
}
