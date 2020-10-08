package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeTTheTitleAndCurrentUrl extends BasicSettings {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title ::: " + pageTitle);
		
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL ::: " + pageURL);
		
		driver.close();
		
	}
}
