package com.alphabet.gmail.testscript;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SampleTest extends BasicSettings {
	
	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome", "https://www.google.com/");
		
	}
}
