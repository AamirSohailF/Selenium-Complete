package com.alphabet.gmail.loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CustomizedSleep extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
				
		
		for (int i = 0; i <= 40 ; i++) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Link Present at the " + i + "'th time");
				break ;	
			} 
			catch (NoSuchElementException e) {
				System.out.println("Link Not Present");
			}
		}
		
		driver.close();
		
		
	}
	
}
