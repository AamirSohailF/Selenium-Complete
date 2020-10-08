package com.alphabet.gmail.webdrivermethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakePageScreenshot extends BasicSettings
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String date=ldt.toString().replace(':', '-');
		System.out.println(date);
		
		WebDriver driver = setUp("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/LoginPage"+date+".png");
		
		FileUtils.copyFile(srcFile,destFile);
	}
}
