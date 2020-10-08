package com.alphabet.gmail.webdrivermethods;

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
}
