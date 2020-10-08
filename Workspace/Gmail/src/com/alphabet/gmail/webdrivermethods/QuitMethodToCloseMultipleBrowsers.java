package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethodToCloseMultipleBrowsers extends BasicSettings {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		//	driver.close();			//			closes only the window on which execution is being conducted
		driver.quit();
		
		/*
		 * close() closes only the browser which is under execution whereas quit() closes all the browsers
		 * which are running through the code
		 */
		
	}
}
