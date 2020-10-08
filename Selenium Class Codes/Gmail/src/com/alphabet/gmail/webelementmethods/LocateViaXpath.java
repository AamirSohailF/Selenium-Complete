package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LocateViaXpath extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String versionXpath="//td[text()='Java']/..//td[@data-label='Stable Version']";
		String expected = "3.141.59";
		String actual = driver.findElement(By.xpath(versionXpath)).getText();
		if(expected.equals(actual))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.close();
	}
}
