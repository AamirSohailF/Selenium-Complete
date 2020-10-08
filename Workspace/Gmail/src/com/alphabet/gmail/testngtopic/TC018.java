package com.alphabet.gmail.testngtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC018 {	//		Testing parallel execution of TC016 TC017 TC018 TC019 Classes

	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
	}
	
}
