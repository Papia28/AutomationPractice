package common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties 
{	
	public static String filePath = "src\\main\\resources\\config.properties";	
	public static FileInputStream fis;
	public static Properties property = new Properties();
	
	
	public static void loadConfigData() throws Throwable
	{
		try {
			fis = new FileInputStream(new File(filePath));
			property.load(fis);
		}
		catch(Throwable t)
		{
			System.out.println("Error in reading the config.properties file!");
			t.printStackTrace();
		}
	}
	
	public static String getURL() throws Throwable
	{
		try {
			return property.getProperty("URL");
		}
		catch(Throwable t)
		{
			System.out.println("Error in reading the url!");
			t.printStackTrace();
			throw t;
		}
	}
	
	public static String getBrowser() throws Throwable
	{
		try {
			return property.getProperty("Browser");
		}
		catch(Throwable t)
		{
			System.out.println("Error in reading the browser!");
			t.printStackTrace();
			throw t;
		}
	}
	
	public static String getPropertyNamed(String name) throws Throwable
	{
		try {
			return property.getProperty(name);
		}
		catch(Throwable t)
		{
			System.out.println("Error in reading the browser!");
			t.printStackTrace();
			throw t;
		}
	}
}
