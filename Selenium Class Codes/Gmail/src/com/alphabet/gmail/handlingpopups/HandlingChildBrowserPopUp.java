package com.alphabet.gmail.handlingpopups;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;
//Script to print the windowIDs
public class HandlingChildBrowserPopUp extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.naukri.com/");
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId:windowIds)
		{
			System.out.println(windowId);
		}
		System.out.println("The Total Windows are "+windowIds.size());
		driver.quit();
	}
}
