package com.alphabet.gmail.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ReleaseKeysWithoutFail
{
	public static void main(String[] args) throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
	}
}
