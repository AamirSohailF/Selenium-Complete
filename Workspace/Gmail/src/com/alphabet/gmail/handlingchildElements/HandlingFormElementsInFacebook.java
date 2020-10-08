package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFormElementsInFacebook extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");

		driver.findElement(By.linkText("Create New Account")).click();
		WebElement registrationBox = driver.findElement(By.id("reg_form_box"));				//		parent element driver child element registrationBox
		
		List<WebElement> inputElements = registrationBox.findElements(By.tagName("input"));
		System.out.println("Size of Input Elements are : " + inputElements.size());
		
		for (WebElement element : inputElements) {
			System.out.println(element.getAttribute("name"));
		}
		
		driver.close();
		
	}
	
	
}
