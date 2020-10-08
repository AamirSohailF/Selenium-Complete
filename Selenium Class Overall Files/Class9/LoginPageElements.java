package com.alphabet.gmail.loginscript;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class LoginPageElements extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.navigate().to("https://demo.actitime.com/tasks/tasklist.do");
	}
}
