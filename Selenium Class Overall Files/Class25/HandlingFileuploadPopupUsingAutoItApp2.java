package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFileuploadPopupUsingAutoItApp2 extends BasicSettings 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = setUp("https://www.naukri.com/");
		closeChildBrowsers(driver, 0);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Runtime.getRuntime().
		exec("D:\\Java Selenium\\SCSW4\\Session 31\\AutoIt\\FileUpload.exe");
	}
}
