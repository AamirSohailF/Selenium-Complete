package com.alphabet.gmail.handlingframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SwitchingToAFrame extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://jqueryui.com/draggable/");
		
		
		driver.switchTo().frame(0);
		
		
		
		WebElement block=driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(block, 374, 74).perform();
	}
}

