package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class GettingDataFromPropertyFile extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./resources/config.properties";
		
		FileInputStream propertyFile = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(propertyFile);
		
		String appUrl = prop.getProperty("appUrl");
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);			//			feeding data(appUrl) from config file into the site
		
//		OR
//		WebDriver driver = setUp(appUrl);
		
		driver.findElement(By.id("username")).sendKeys(user);			//			feeding data(username) from config file into the site
		driver.findElement(By.name("pwd")).sendKeys(pass);			//			feeding data(password) from config file into the site
		driver.findElement(By.id("loginButton")).click();
		
		mySleepInSeconds(10);
		driver.close();
		
		
		
	}
	
}
