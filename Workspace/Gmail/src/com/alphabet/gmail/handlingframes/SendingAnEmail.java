package com.alphabet.gmail.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SendingAnEmail extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
		String subjectXpath = "//input[@class='rd_inp_sub rd_subject_datacmp2']";
		driver.findElement(By.xpath(subjectXpath)).sendKeys("Testing automation of mail");
				
		WebElement mailBodyXpath = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		
		driver.switchTo().frame(mailBodyXpath);			//			switching driver to the body of mail
		
		String mailXPath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
		driver.findElement(By.xpath(mailXPath)).sendKeys("Automation Test Case Mail Check");
		
		driver.switchTo().defaultContent();				//		switching driver back to default
		
		driver.findElement(By.linkText("Send")).click();
		
		mySleepInSeconds(10);
		driver.close();
		
	}
	
}
