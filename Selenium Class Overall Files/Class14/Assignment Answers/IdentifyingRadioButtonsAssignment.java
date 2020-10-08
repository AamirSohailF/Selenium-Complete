package com.alphabet.gmail.handlingchildElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Q.	Print the Count and the Name of all the Radio Buttons in Facebook

public class IdentifyingRadioButtonsAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		WebElement table = driver.findElement(By.id("reg_form_box"));		//		parent element driver child element table
		
		List<WebElement> tableElements = table.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
				
		int count = 0 ;
		
		for (int i = 0; i < tableElements.size(); i++) {
			count++;
		}
		
		System.out.println("Number of Radio Buttons : " + count);
		
		System.out.println("------------------------ Radio Buttons Are : ------------------------");
		
		for (WebElement radioElements : tableElements) {
			System.out.println(radioElements.getText());
		}
		
		driver.close();
	}
	
}
