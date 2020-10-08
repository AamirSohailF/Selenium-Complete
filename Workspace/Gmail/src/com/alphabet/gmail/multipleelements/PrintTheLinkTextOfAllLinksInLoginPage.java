package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PrintTheLinkTextOfAllLinksInLoginPage extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		------------------------	OR	------------------------
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("--------- PrintTheLinkTextOfAllLinksInLoginPage Using for loop ---------");
		for (int i = 0; i < allLinks.size() ; i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		System.out.println();
		
		System.out.println("--------- PrintTheLinkTextOfAllLinksInLoginPage Using for each loop ---------");
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
		driver.close();
		
		
	}
	
}
