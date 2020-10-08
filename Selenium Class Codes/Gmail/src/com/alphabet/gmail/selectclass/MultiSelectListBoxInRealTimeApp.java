package com.alphabet.gmail.selectclass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MultiSelectListBoxInRealTimeApp extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.tricentis.com/software-testing-tool-trial-demo/qtest-trial/");
		WebElement interestedList = driver.findElement(By.id("Interested_in_Learning_About__c"));
		
		Select s = new Select(interestedList);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement option:allOptions)
		{
			s.selectByValue(option.getAttribute("value"));
		}
		
		s.deselectByIndex(3);
	}
}