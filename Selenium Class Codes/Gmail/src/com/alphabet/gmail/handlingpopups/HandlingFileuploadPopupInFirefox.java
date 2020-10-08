package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFileuploadPopupInFirefox extends BasicSettings
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = setUp("https://www.naukri.com/", "firefox");
		closeChildBrowsers(driver, 15);
		driver.findElement(By.id("wdgt-file-upload")).click();
		String autoItScript="D:\\Java Selenium\\SCSW4\\Session 30\\AutoIT\\ScriptToHandleFileUploadPopUpInFirefox.exe";
		Runtime.getRuntime().exec(autoItScript);
	}
}
