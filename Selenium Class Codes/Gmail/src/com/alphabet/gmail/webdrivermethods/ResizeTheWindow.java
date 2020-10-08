package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeTheWindow extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		
		int height=dim.getHeight();
		int width=dim.getWidth();
		System.out.println("Height="+height);
		System.out.println("Width="+width);
		
		
		Dimension dim2 = new Dimension(300, 400);
		driver.manage().window().setSize(dim2);
	}
}
