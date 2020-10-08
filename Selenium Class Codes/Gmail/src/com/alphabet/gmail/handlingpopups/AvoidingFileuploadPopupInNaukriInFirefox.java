package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class AvoidingFileuploadPopupInNaukriInFirefox extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.naukri.com/", "firefox");
		closeChildBrowsers(driver, 15);
		driver.findElement(By.id("file_upload")).sendKeys("D:\\Selenium_Resume.doc");
	}
}