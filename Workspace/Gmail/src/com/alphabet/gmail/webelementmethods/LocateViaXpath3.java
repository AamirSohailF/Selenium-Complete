package com.alphabet.gmail.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

/*
 * 	Write Xpath for Google image from google website
 */

public class LocateViaXpath3 extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println("-------------- Using Attribute --------------");
//		WebElement e1 = driver.findElement(By.xpath("//img[@alt='Google']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@height='92']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@id='hplogo']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@srcset='/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png 1x, /images/branding/googlelogo/2x/googlelogo_color_272x92dp.png 2x']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@style='padding-top:109px']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@width='272']"));
//		WebElement e1 = driver.findElement(By.xpath("//img[@data-iml='1597757481806']"));
		WebElement e1 = driver.findElement(By.xpath("//img[@data-atf='1']"));
		
		System.out.println("-------------- Using contains --------------");
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@alt, 'Google')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@height, '92')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@id, 'hplogo')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@src, '/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@srcset, '/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png 1x, /images/branding/googlelogo/2x/googlelogo_color_272x92dp.png 2x')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@style, 'padding-top:109px')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@width, '272')]"));
//		WebElement e2 = driver.findElement(By.xpath("//img[contains(@data-iml, '1597757481806')]"));
		WebElement e2 = driver.findElement(By.xpath("//img[contains(@data-atf, '1')]"));
		
		
	}
	
}
