package com.alphabet.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver ;

	public BasePage(WebDriver driver){
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.titleIs(title));
	}
}
