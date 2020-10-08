package com.alphabet.gmail.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseClick extends BasicSettings {

	public static void main(String[] args) throws AWTException {
		
		mySleepInSeconds(5);
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
	}
	
}