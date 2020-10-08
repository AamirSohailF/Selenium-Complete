package com.alphabet.gmail.handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingFileuploadPopupInChromeUsingAutoIT extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		closeChildBrowsers(driver, 0);
		driver.findElement(By.id("wdgt-file-upload")).click();
		String autoScript = "E:\\QSpiders\\Selenium\\Workspace\\AutoIT\\ScriptToHandleFileUploadPopUp.exe";
		Runtime.getRuntime().exec(autoScript);
		
	}
	
}
