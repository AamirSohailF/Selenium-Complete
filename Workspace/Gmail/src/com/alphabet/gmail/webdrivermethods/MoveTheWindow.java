package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveTheWindow extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Dimension dim = new Dimension(300,450);
		driver.manage().window().setSize(dim);
		
		
		Point pos = driver.manage().window().getPosition();
		int startX = pos.getX();
		int startY = pos.getY();
		
		System.out.println("X : " + startX);
		System.out.println("Y : " + startY);
		
		Point p = new Point(50,200);
		driver.manage().window().setPosition(p);
		
		
	}
	
}
