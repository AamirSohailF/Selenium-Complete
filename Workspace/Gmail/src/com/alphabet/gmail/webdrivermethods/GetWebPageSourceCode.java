package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebPageSourceCode extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String pageSrc = driver.getPageSource();
		System.out.println("Page Source Code - " + pageSrc);
		
		driver.close();
		
	}
}
