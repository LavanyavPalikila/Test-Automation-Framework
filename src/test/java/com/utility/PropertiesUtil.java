package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {

	public static String readProperty(Env env, String propertyName) {
		
		File propfile = new File(System.getProperty("user.dir") +  "\\config\\"+ env +".properties");
		FileReader propfileReader = null;
		Properties properties = new Properties();
		try {
			propfileReader = new FileReader(propfile);
			properties.load(propfileReader);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		String value = properties.getProperty(propertyName.toUpperCase());
		return value;
	}

}
