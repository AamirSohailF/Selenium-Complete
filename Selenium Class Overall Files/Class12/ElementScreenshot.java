package com.alphabet.gmail.webelementmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ElementScreenshot extends BasicSettings
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = setUp();
		File srcFile = driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/loginButton.png");
		
		FileUtils.copyFile(srcFile,destFile);
	}
}
