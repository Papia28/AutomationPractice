package driverClasses;

import org.openqa.selenium.remote.UnreachableBrowserException;

import common.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class DriverManager 
{	
	private static String browser = null;
	
	public static void setBrowser()
	{
		try {
			ReadProperties.loadConfigData();
		browser = ReadProperties.getBrowser();
		}
		catch(Throwable t)
		{
			System.out.println("Error in getting the browser!");
			t.printStackTrace();
		}
	}
	
	public static String getBrowser()
	{
		return browser;
	}
	
	public static void setBrowserDriver()
	{
		try {
			setBrowser();
			switch(browser)
			{
			case "Chrome": 
				WebDriverManager.chromedriver().setup(); 
				break;
				
			default: 
				System.out.println("Browser not supported!");
			}
		}
		catch(UnreachableBrowserException e)
		{
			System.out.println("Error in setting the browser!");
			e.printStackTrace();
		}
		catch(Throwable t)
		{
			System.out.println("Error in setting the browser driver!");
			t.printStackTrace();
		}
	}
}
