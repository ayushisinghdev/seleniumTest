package com.qa.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	public static Properties prop;
	
	public BaseClass() throws FileNotFoundException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("/home/ayushi/eclipse-workspace/api/src/main/java/com/qa/config/config.properties");
	try {
		prop.load(ip);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
