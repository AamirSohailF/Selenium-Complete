package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

/*
 * 	NOT IMPORTANT PROGRAM BECAUSE UPLOAD IS BASED ON COORDINATES...WE CAN DO THE SAME BY SENDKEYS
 */
public class HandlingFileuploadPopupUsingAutoItApp2 extends BasicSettings {

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver = setUp("https://www.naukri.com/");
		closeChildBrowsers(driver, 0);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Runtime.getRuntime().
		exec("E:\\\\QSpiders\\\\Selenium\\\\Workspace\\\\AutoIT\\\\FileUpload.exe");
	
	}
	
}
