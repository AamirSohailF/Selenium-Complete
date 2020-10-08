package com.alphabet.gmail.robotclass;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TakeWebPageScreentshot extends BasicSettings
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		WebDriver driver = setUp();
		Dimension dim=driver.manage().window().getSize();
		
		Robot robot = new Robot();
		Rectangle rect = new Rectangle(dim.getWidth(),dim.getHeight());
		BufferedImage img = robot.createScreenCapture(rect);
		File dest=new File("./errorshots/robotBrowserWindowCapture.png");
		ImageIO.write(img, "png", dest);
	}
}
