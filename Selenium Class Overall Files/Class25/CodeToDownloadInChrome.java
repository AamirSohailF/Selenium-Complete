package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CodeToDownloadInChrome extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();		
	}
}
