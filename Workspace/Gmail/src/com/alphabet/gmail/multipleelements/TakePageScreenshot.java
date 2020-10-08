package com.alphabet.gmail.multipleelements;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TakePageScreenshot extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.toString().replace(":", "-");
		System.out.println(date);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./errorshots/googlehomepage" + date + ".png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		driver.close();
		
	}
	
	
}
