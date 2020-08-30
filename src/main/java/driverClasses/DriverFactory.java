package driverClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import waits.WaitFunctions;

public class DriverFactory extends DriverManager 
{
	private WebDriver driver = null;
	private static DriverFactory driverFactoryInstance = null;
	
	private DriverFactory()
	{
		setDriver();		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver()
	{
		try {
			//get browser name and set driver object accordingly
			setBrowserDriver();
			switch (getBrowser()) 
			{
				case "Chrome":
					driver = new ChromeDriver();
					driver = WaitFunctions.implicitWait(driver);
					break;
			}
		} 
		catch (WebDriverException e) 
		{
			System.out.println("Error in starting WebDriver!");
			e.printStackTrace();
		}
		catch(Throwable t)
		{
			System.out.println("Error in creating WebDriver object!");
			t.printStackTrace();
		}
	}
	
	public static DriverFactory getDriverFactoryObject()
	{
		//generate only single instance of driver for a single execution flow
		try {
			if (driverFactoryInstance == null)
				driverFactoryInstance = new DriverFactory();
			return driverFactoryInstance;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating instance of DriverFactory!");
			throw t;
		}
	}
	
	public static void deleteDriverInstance() throws Throwable
	{
		//delete driver object once execution ends
		try {
			driverFactoryInstance = null;
		}
		catch(Throwable t)
		{
			System.out.println("Error in setting driver instance to null: deleteDriverInstance()");
		}
	}

}
