package com.alphabet.gmail.handlingpopups;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingDownloadPopUpInChromeUsingAutoIt extends BasicSettings
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		WebDriver driver = setUp("https://www.selenium.dev/downloads/", "firefox");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Runtime.getRuntime().exec("D:\\Java Selenium\\SCSW4\\Session 31\\AutoIt\\FileDownloadPopUp.exe");
	}
}
