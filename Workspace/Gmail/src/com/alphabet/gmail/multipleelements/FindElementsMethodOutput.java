package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class FindElementsMethodOutput extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		List<WebElement> list = driver.findElements(By.tagName("Mohan"));			//		Here page doesn't contain any tag by name Mohan.
		//	if the page doesn't contain the given tagName called on for findElements it returns an empty list
		System.out.println("Size of the list : " + list.size());			//		Hence it returns size as 0
		
		System.out.println(list);			//			Return an empty list []
		
		driver.close();
		
	}
	
	
}
