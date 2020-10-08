package com.alphabet.gmail.handlingpopups;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class PrintTitleOfAllWindowsAndClose extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.naukri.com/");
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId:windowIds)
		{
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			driver.close();
		}
		System.out.println("The Total Windows are "+windowIds.size());
	}
}
