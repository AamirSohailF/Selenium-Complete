package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethodToCloseMultipleBrowsers extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
//		driver.close();
		driver.quit();
	}
}
