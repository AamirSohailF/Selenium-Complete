package com.alphabet.gmail.webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;
public class IsSelectedMethod extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://live.skillrary.com/testing-app/login.php?type=login");
		
		WebElement keepMeCheckbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		keepMeCheckbox.click();
		
		if(keepMeCheckbox.isSelected())
		{
			System.out.println("Checkbox is Selected");
		}
		else
		{
			System.out.println("Checkbox is Not Selected");
		}
	}
}
