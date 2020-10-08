package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectAnAutoSuggestionsInGoogle extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		
		mySleepInSeconds(5);
		
		String suggestionsXpath = "//li[@class='sbct' or @class='sbct sbre']";
		List<WebElement> suggestions = driver.findElements(By.xpath(suggestionsXpath));
		
		for(WebElement suggestion:suggestions)
		{
			if(suggestion.getText().contains("gel"))
			{
				System.out.println(suggestion.getText());
				suggestion.click();
				break;
			}
		}
	}
}	
