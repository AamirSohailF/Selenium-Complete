package com.alphabet.gmail.handlingpopups;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.alphabet.gmail.webdrivermethods.BasicSettings;

//WAS to Select Today's Date in Calendar PopUp
public class SelectingTodaysDateInCalendarPopup extends BasicSettings
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		int day = ldt.getDayOfMonth();
		String month=ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
	}
}
//Your Balance is 500 Rs
//"Your Balance is "+balance+" Rs"