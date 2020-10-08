package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 *	From https://www.selenium.dev/downloads/
 *	website print Stable version of Java onto the console
 */
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaIndependentAndDependentXpath extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement e1 = driver.findElement(By.xpath("//td[text()='Java']/..//td[@data-label='Stable Version']"));
		System.out.println("Version : " + e1.getText());
		
	}
	
	
}
