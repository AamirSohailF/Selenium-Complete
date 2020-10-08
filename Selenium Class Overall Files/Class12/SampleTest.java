package com.alphabet.gmail.testscripts;

import java.io.IOException;
import java.time.LocalDateTime;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class SampleTest extends BasicSettings
{
	public static void main(String[] args) throws IOException
	{
//		File f1=new File("./errorshots/a1.txt");
		//f1.mkdir();
		//f1.createNewFile();
		
		LocalDateTime ldt = LocalDateTime.now();
		String date=ldt.toString().replace(':', '-');
		System.out.println(date);
	}
}
