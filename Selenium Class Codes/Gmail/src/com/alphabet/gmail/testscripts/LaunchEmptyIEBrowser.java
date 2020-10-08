package com.alphabet.gmail.testscripts;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchEmptyIEBrowser
{
	public static void main(String[] args) 
	{
		String ieKey="webdriver.ie.driver";
		String iePath="./drivers/IEDriverServer.exe";
		System.setProperty(ieKey,iePath);
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
	}
}
