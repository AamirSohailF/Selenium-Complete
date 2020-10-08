package com.alphabet.gmail.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

//	Verify Whether the Sent email is available in Sent Items

public class SendingAnEmailAssignment extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
		String subjectXpath = "//input[@class='rd_inp_sub rd_subject_datacmp2']";
		driver.findElement(By.xpath(subjectXpath)).sendKeys("Final Test AF");
				
		WebElement mailBodyXpath = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		
		driver.switchTo().frame(mailBodyXpath);			//			switching driver to the body of mail
		
		String mailXPath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
		driver.findElement(By.xpath(mailXPath)).sendKeys("Automation Test Case Mail Check A0105");
		
		driver.switchTo().defaultContent();				//		switching driver back to default
		
		driver.findElement(By.linkText("Send")).click();
		
		driver.findElement(By.linkText("Sent")).click();
		
		WebElement sentCheck = driver.findElement(By.xpath("//span[text()='Final Test AF']"));
		
		if (sentCheck.isDisplayed()) {
			System.out.println("Mail Sent And Checked In Sent Box");
		}
		
		
		mySleepInSeconds(5);
		driver.close();
		
	}

}
