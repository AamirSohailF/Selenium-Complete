package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class Amazon extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		for (int i = 0; i < 5; i++) {

			WebElement idLocator = driver.findElement(By.id("twotabsearchtextbox"));
			idLocator.sendKeys("iPhone 11");
			
			WebElement classLocator = driver.findElement(By.className("nav-input"));
			classLocator.click();
			
			Navigation nav = driver.navigate();
			nav.back();
		  
		}
		
		
		
		
	}
	
	
}
