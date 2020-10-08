package com.alphabet.gmail.handlingpopups;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SelectNextYearPratice extends BasicSettings {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		
		int day = ldt.getDayOfMonth();
		
		String currentMonth = ldt.getMonth().name();
		currentMonth = currentMonth.substring(0,1).toUpperCase() + currentMonth.substring(1).toLowerCase();
		
		String currentYear = ldt.getYear() + "";
		
		
		WebDriver driver = setUp("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		String nextYearDateXpath = "//span[text()='" + currentYear + "']/..//span[text()='" + currentMonth + "']/../../..//a[text()='" + day + "']";
		
		outerloop:
		for (;;) {
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			List<WebElement> months = driver.findElements(By.className("ui-datepicker-month"));
			for (WebElement month : months) {
				if (month.getText().equals(currentMonth)) {
					List<WebElement> years = driver.findElements(By.className("ui-datepicker-year"));
					for (WebElement year : years) {
						if (year.getText().equals(currentYear)) {
							driver.findElement(By.xpath(nextYearDateXpath)).click();
							break outerloop;												
						}
					}
				}
			}
		}
		
		
		mySleepInSeconds(5);
		driver.close();
		
		
	}
	
}
