package poymorphisminselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CodeWithoutPolymorphismIn2Browsers extends BasicSettings 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.google.com/");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
	}
}
