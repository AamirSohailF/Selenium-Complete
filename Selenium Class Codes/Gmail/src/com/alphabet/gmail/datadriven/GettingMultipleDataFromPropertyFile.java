package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class GettingMultipleDataFromPropertyFile
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = "D:\\Java Selenium\\SCSW4\\Session 35\\config.properties";
		FileInputStream propertyFile = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(propertyFile);
		
		Set<Object> set = prop.keySet();
		for(Object key:set)
		{
			System.out.println(key+"::"+prop.get(key));
		}
	}
}
