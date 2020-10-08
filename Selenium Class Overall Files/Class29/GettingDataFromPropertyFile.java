package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingDataFromPropertyFile
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = "D:\\Java Selenium\\SCSW4\\Session 35\\config.properties";
		FileInputStream propertyFile = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(propertyFile);
		
		String appUrl=prop.getProperty("appUrl");
		String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	}
}
