package com.alphabet.gmail.handlingchildElements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFormElementsInFacebook extends BasicSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = setUp("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement registrationForm = driver.findElement(By.id("reg_form_box"));
		
		List<WebElement> inputElements = registrationForm.findElements(By.tagName("input"));
		System.out.println("The Total Input Elements is::"+inputElements.size());
		
		for(WebElement inputElement:inputElements)
		{
			System.out.println(inputElement.getAttribute("name"));
		}
		
	}
}