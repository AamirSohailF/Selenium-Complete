package com.alphabet.gmail.testscripts;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SampleTest extends BasicSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = setUp("firefox","https://www.facebook.com", "30");
	}
}
