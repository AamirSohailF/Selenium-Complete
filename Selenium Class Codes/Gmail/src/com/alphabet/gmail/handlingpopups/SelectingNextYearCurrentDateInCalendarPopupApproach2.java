package com.alphabet.gmail.handlingpopups;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectingNextYearCurrentDateInCalendarPopupApproach2 extends BasicSettings
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
		
		for(int i=1;i<=11;i++)
		{
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		}
		
		driver.findElement(By.xpath(cXpath)).click();
	}
}
