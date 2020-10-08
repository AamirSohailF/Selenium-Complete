package com.alphabet.gmail.handlingpopups;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingNextYearCurrentDateInCalendarPopup extends BasicSettings
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		System.out.println(ldt);
		
		int day = ldt.getDayOfMonth();
		
		String currentMonth=ldt.getMonth().name();
		currentMonth = currentMonth.substring(0,1).toUpperCase() + currentMonth.substring(1).toLowerCase();
		
		String year=ldt.getYear()+"";//Integer.toString(year);
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		String cXpath="//span[.='"+year+"']/..//span[.='"+currentMonth+"']/../../..//a[.='"+day+"']";
		
		outerLoop:
		for(;;)
		{
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			List<WebElement> months=driver.findElements(By.className("ui-datepicker-month"));
			for(WebElement monthNameInPopup:months)			
			{
				if(monthNameInPopup.getText().equals(currentMonth))
				{
					List<WebElement> years=driver.findElements(By.className("ui-datepicker-year"));
					for(WebElement yearInPopup:years)
					{
						if(yearInPopup.getText().equals(year))
						{							
							driver.findElement(By.xpath(cXpath)).click();
							break outerLoop;
						}
					}
					
				}
			}
		}
	}
}
