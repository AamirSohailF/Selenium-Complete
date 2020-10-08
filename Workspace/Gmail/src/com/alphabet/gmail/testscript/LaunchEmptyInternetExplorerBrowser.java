package com.alphabet.gmail.testscript;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchEmptyInternetExplorerBrowser {
	public static void main(String[] args) {
		String ieKey="webdriver.ie.driver";
		String iePath="./drivers/IEDriverServer.exe";
		System.setProperty(ieKey,iePath);
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
	}
}
