package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class IsEnabledMethod extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("E:\\QSpiders\\Selenium\\Selenium Class Overall Files\\Class11\\index.html");
		System.out.println(driver.findElement(By.id("b1")).isEnabled());	//		if the element is marked as Disabled then it returns false else it returns true
//		driver.close();
		
		
	}
	
	
}
