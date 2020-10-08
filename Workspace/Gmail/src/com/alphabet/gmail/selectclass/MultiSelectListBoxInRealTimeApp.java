package com.alphabet.gmail.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MultiSelectListBoxInRealTimeApp extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.tricentis.com/software-testing-tool-trial-demo/qtest-trial/");
		
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon']")).click();
		//	to remove the CookiePopUp [Not Necessary]
		
		
		WebElement interestedListBox = driver.findElement(By.id("Interested_in_Learning_About__c"));
		
		Select s = new Select(interestedListBox);
		
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement option : allOptions) {
			s.selectByValue(option.getAttribute("value"));
		}
		
		s.deselectByIndex(2);
		
		mySleepInSeconds(1);
		driver.close();
		
	}
	
}
