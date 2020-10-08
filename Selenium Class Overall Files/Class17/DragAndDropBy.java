package com.alphabet.gmail.actionsclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DragAndDropBy extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://jqueryui.com/draggable/");
		
		WebElement block=driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(block, 374, 74).perform();
	}
}

