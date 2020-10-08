package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFileuploadPopupInFirefoxUsingAutoIT extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp("https://www.naukri.com/", "firefox");
		closeChildBrowsers(driver, 10);
		driver.findElement(By.id("wdgt-file-upload")).click();
		String autoScript = "E:\\QSpiders\\Selenium\\Workspace\\AutoIT\\ScriptToHandleFileUploadPopUpInFirefox.exe";
		Runtime.getRuntime().exec(autoScript);
		
	}
	
}
