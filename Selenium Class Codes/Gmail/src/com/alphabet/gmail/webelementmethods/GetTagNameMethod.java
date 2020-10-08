package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;
//Verify whether Google is a Image or not
public class GetTagNameMethod extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.google.com/");
		String expectedTagName = "img";
		String actualTagName=driver.findElement(By.id("hplogo")).getTagName();
		if(actualTagName.equals(expectedTagName))
		{
			System.out.println("Pass:: Its a Image");
		}
		else
		{
			System.out.println("Fail:: Its not a Image");
		}
	}
}
