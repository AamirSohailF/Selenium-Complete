package com.alphabet.gmail.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Avoid Using mySleepInSeconds(5) which is used in SelectAnAutoSuggestionsInGoogle.java file

		//		--------------------------------		TO BE COMPLETED		----------------------------------

public class SelectAnAutoSuggestionsInGoogleWithoutUsingThreadSleepAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.name("q")).sendKeys("Indian Cricket Team");
		
		String suggestionsXPath = "//li[@class='sbct' or @class='sbct sbre']";
		List <WebElement> searchResults = driver.findElements(By.xpath(suggestionsXPath));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));
		//		-----------------------------	Spotting Error Here Line 27	-----------------------------
//		driver.findElement(By.partialLinkText("sponsor")).click();
		
		
//		mySleepInSeconds(5);
		
		for (WebElement select : searchResults) {
			if (select.getText().contains("list")) {
				System.out.println(select.getText());
				select.click();
				break ;
			}
		}
		
		System.out.println("Execution Done");
//		driver.close();
		
	}
	
}
