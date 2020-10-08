package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeTheWindow extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Dimension dim = driver.manage().window().getSize();
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("Height : " + height);
		System.out.println("Width : " + width);
		
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		
		
	}
	
}
