package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;
//https://username:password@url <== Syntax to handle Authentication PopUp
public class HandlingAuthenticationPopUp extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
