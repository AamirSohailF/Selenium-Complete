package com.alphabet.gmail.webdrivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSettings 
{
	static
	{
		String chromeKey="webdriver.chrome.driver";
		String chromeDriverPath = "./drivers/chromedriver.exe";
		
		System.setProperty(chromeKey,chromeDriverPath);
		
		String firefoxKey="webdriver.gecko.driver";
		String firefoxPath="./drivers/geckodriver.exe";
		System.setProperty(firefoxKey, firefoxPath);
		
		String ieKey="webdriver.ie.driver";
		String iePath="./drivers/IEDriverServer.exe";
		System.setProperty(ieKey,iePath);
	}
	
	public static void mySleepInSeconds(long seconds)
	{
		long milliseconds = seconds * 1000;
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static WebDriver setUp(String... config)
	{
		String browserName=null;
		String url=null;
		long ITO=0;
		
		try
		{
			url=config[0];
		}
		catch(Exception e)
		{
			url="https://demo.actitime.com";
		}
		
		try
		{
			browserName=config[1];
		}
		catch(Exception e)
		{
			browserName="chrome";
		}
		
		
		
		try
		{
			ITO=Long.parseLong(config[2]);
			
		}
		catch(Exception e)
		{
			ITO=20;
		}
		
		
		WebDriver driver =null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);		
		driver.get(url);
		
		return driver;
	}
}










