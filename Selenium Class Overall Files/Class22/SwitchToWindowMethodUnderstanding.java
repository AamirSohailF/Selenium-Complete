package com.alphabet.gmail.handlingpopups;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;
public class SwitchToWindowMethodUnderstanding extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.naukri.com/");
		String[] windowNames = {"1","2","3"};
		for(String windowName:windowNames)
		{
			driver.switchTo().window(windowName);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		driver.switchTo().window("");
		driver.close();
	}
}
