package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Print only the non-empty linktexts of Actitime Login Page

public class PrintOnlyTheNonEmptyLinkTextOfAllLinksInLoginPageAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
//		------------------------	OR	------------------------
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for (WebElement nonEmptyLink : allLinks) {
			if (nonEmptyLink.getText().isEmpty()) {
				
			}
			
			else {
				System.out.println(nonEmptyLink.getText());
			}
		}
	
		driver.close();
		
	}
	
	
}
