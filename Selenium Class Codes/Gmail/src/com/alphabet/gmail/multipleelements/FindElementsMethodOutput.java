package com.alphabet.gmail.multipleelements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class FindElementsMethodOutput extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		List<WebElement> list = driver.findElements(By.tagName("Mohan"));
		System.out.println("The Size is "+list.size());	
		System.out.println(list);
	}
}
