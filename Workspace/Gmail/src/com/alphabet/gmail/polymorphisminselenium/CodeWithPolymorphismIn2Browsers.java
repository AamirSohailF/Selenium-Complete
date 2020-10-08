package com.alphabet.gmail.polymorphisminselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;


class MyClass{
	
	public static void genericMethod(WebDriver driver) {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	
}

public class CodeWithPolymorphismIn2Browsers extends BasicSettings {
	
	public static void main(String[] args) {
		
		MyClass.genericMethod(new ChromeDriver());
		MyClass.genericMethod(new FirefoxDriver());
		
	}
	
}
