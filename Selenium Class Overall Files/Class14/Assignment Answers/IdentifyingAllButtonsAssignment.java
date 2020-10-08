package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Print the Count and the Name of all the Buttons in Facebook

public class IdentifyingAllButtonsAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement table = driver.findElement(By.id("reg_form_box"));
		
		List<WebElement> buttons = table.findElements(By.tagName("button"));
		
		int count = 0;
		
		for (int i = 0; i < buttons.size(); i++) {
			count++;
		}
		
		System.out.println("Number of Buttons on the Page : " + count);
		
		System.out.println("------------------------ Buttons Present On The Page Are : ------------------------");
		
		for (WebElement b : buttons) {
			System.out.println(b.getText());
		}
		
		driver.close();
		
	}
	
}
