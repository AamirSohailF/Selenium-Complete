package com.alphabet.gmail.encapsulationtopic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class StaleElementRefernceException extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		DemoA d = new DemoA(driver);
		driver.navigate().refresh();
		d.setUsername("admin");
	}
}
