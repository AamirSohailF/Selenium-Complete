package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class GettingMultipleDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./resources/config.properties";
		
		FileInputStream propertyFile = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(propertyFile);
		
		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.println(key + " :: " + prop.get(key));
		}
		
	}
	
}
