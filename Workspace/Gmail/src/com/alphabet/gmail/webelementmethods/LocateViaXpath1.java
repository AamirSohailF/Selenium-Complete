package com.alphabet.gmail.webelementmethods;
import org.openqa.selenium.By;
/*
 * 	From https://demo.actitime.com/
	Write Xpath for Login Button
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaXpath1 extends BasicSettings {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("-------- Using text() -------- ");
//		WebElement e1 = driver.findElement(By.xpath("//div[text()='Login ']"));
//		OR
		WebElement e1 = driver.findElement(By.xpath("//div[.='Login ']"));
		String s1 = e1.getText();
		System.out.println(s1);
		
		System.out.println("-------- Using contains -------- ");
//		WebElement e2 = driver.findElement(By.xpath("//div[contains(.,'Login ')]"));
//		OR		
		WebElement e2 = driver.findElement(By.xpath("//div[contains(text(),'Login ')]"));
		String s2 = e2.getText();
		System.out.println(s2);
		
		mySleepInSeconds(2);
		driver.close();
		
	}
	
}
