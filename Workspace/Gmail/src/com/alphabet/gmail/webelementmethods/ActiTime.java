package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ActiTime extends BasicSettings {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userTB = driver.findElement(By.id("username"));
		userTB.sendKeys("trainer");
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("password922838293");
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
	}
	
}
