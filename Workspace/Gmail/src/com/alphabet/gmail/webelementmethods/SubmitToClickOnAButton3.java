package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SubmitToClickOnAButton3 extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("chrome","https://www.facebook.com");
		
		driver.findElement(By.id("u_0_2")).click();
		
		driver.findElement(By.name("websubmit")).submit();
		
		/* -------------------------------	IMPORTANT -------------------------------
		1. form Element
		2. type should be submit
		3. Enter the all the mandatory information before using submit method
		4. submit method is a programmatic click
	*/
	}
}
