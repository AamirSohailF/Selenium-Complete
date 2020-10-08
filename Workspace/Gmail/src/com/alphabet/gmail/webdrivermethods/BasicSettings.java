package com.alphabet.gmail.webdrivermethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSettings {
	static {
			//		chromeDriver
		String chromeKey = "webdriver.chrome.driver";
		String chromeDriverPath = "./drivers/chromedriver.exe";
		
		System.setProperty(chromeKey, chromeDriverPath);
		
			//		mozillaDriver
		String firefoxKey = "webdriver.gecko.driver";
		String firefoxDriverPath = "./drivers/geckodriver.exe";
		
		System.setProperty(firefoxKey, firefoxDriverPath);
		
			//		ieDriver
		String ieKey = "webdriver.ie.driver";
		String ieDriverPath = "./drivers/IEDriverServer.exe";
		
		System.setProperty(ieKey, ieDriverPath);
		
	}
	
	
	public static long mySleepInSeconds(long seconds) {
		
		long millisecond = seconds * 1000 ;
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seconds;	
	}
	
	
	public static WebDriver setUp(String...config) {
		
		String browserName = null ;
		String url = null ;
		long ITO = 0 ;
		
		
		try {
			url = config[0] ;
		} catch (Exception e) {
			// TODO: handle exception
			url = "https://demo.actitime.com" ;
		}
		
		
		
		try {
			browserName = config[1] ;
		} catch (Exception e) {
			// TODO: handle exception
			browserName = "chrome" ;
		}
		
		
		
		try {
			ITO = Long.parseLong(config[2]) ;
		} catch (Exception e) {
			// TODO: handle exception
			ITO = 20 ;
		}
		
		
		WebDriver driver = null ;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver() ;
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver() ;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS) ;
		driver.get(url);
		
		return driver ;
		
		
	}
	
	
	public static void closeChildBrowsers(WebDriver driver, long delayInSeconds) {
		
		mySleepInSeconds(delayInSeconds);
		String parentWid = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.remove(parentWid);
		for (String wid : windowIds) {
			driver.switchTo().window(wid).close();
		}
		
		driver.switchTo().window(parentWid);
		
	}
	
	
	
	
}
