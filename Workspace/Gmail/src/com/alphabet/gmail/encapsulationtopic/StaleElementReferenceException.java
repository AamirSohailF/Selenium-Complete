package com.alphabet.gmail.encapsulationtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class StaleElementReferenceException extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		DemoA d = new DemoA(driver);
		driver.navigate().refresh();
		d.setUsername("admin");			/*			here we get StaleElementReferenceException because the old driver reference is no longer available
													after the refresh is done		*/
	}
	
}
