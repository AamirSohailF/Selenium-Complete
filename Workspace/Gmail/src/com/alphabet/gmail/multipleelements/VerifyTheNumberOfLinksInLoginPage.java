package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class VerifyTheNumberOfLinksInLoginPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int expectedLinks = 7 ;
		int actualLinks =allLinks.size();
		System.out.println(actualLinks);
		
		if (actualLinks == expectedLinks) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
		
	}
	
	
}
