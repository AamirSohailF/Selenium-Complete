package com.alphabet.gmail.handlingpopups;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DownloadSecurityMessageInChrome extends BasicSettings
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = setUp("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("3.141.59")).click();
		mySleepInSeconds(5);
		Robot robot = new Robot();
		robot.mouseMove(350, 835);
		mySleepInSeconds(5);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}
