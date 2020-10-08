package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectAnAutoSuggestionsInGoogle extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		
		mySleepInSeconds(2);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class = 'sbct' or @class = 'sbct sbre']"));
		
		
		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().contains("nutrition")) {
				System.out.println(suggestion.getText());
				suggestion.click();
				break;
			}
		}

		
	}
	
	
}
