package com.alphabet.gmail.webelementmethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Take the error message screenshot/Login Panel Screenshot

public class ScreenshotErrorMessageActitimeAssignment extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp();
		
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.toString().replace(":", "-");
		System.out.println(date);
		
		driver.findElement(By.id("loginButton")).click();
		File srcFile = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/errorlogin" + date + ".png");
		
		FileUtils.copyFile(srcFile, destFile);
		
//		mySleepInSeconds(2);
		driver.close();
		
	}
	
	
}
