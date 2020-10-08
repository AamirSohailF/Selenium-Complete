package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

/*
 * 	From https://demo.actitime.com/
	Write Xpath for Keep me logged in checkbox
 */

public class LocateViaXpath2 extends BasicSettings {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("Using Xpath by Attribute Keep me logged in is checked");
//		WebElement e1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		OR
//		WebElement e1 = driver.findElement(By.xpath("//input[@name='remember']"));
//		OR
//		WebElement e1 = driver.findElement(By.xpath("//input[@value='on']"));
//		OR
//		WebElement e1 = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
//		OR
		WebElement e1 = driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		mySleepInSeconds(1);
		e1.click();
		
		
		System.out.println("Using Xpath by contains Keep me logged in is unchecked");
//		WebElement e2 = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
//		OR
//		WebElement e2 = driver.findElement(By.xpath("//input[contains(@name,'remember')]"));
//		OR
//		WebElement e2 = driver.findElement(By.xpath("//input[contains(@value,'on')]"));
//		OR
//		WebElement e2 = driver.findElement(By.xpath("//input[contains(@id,'keepLoggedInCheckBox')]"));
//		OR
		WebElement e2 = driver.findElement(By.xpath("//input[contains(@title,'Do not select if this computer is shared')]"));
		mySleepInSeconds(2);
		e2.click();
		
		mySleepInSeconds(1);
		driver.close();
		
		
	}
	
}
