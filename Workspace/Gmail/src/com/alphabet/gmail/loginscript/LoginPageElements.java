package com.alphabet.gmail.loginscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LoginPageElements extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		/*
		 * pageLoadTimeout limits the time that the script allots for a web page to be displayed.
		 * If the page loads within the time then the script continues. If the page does not 
		 * load within the timeout the script will be stopped by a TimeoutException
		 */
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.navigate().to("https://demo.actitime.com/tasks/tasklist.do");
		
		
		
	}
	
	
}
