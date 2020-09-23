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
		try {
			setSession();
		} 
		catch (Throwable e) {
			e.printStackTrace();
		}		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setSession() throws Throwable
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
			throw e;
		}
		catch(Throwable t)
		{
			System.out.println("Error in creating WebDriver object!");
			t.printStackTrace();
			throw t;
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
	
	public void quitSession() throws Throwable
	{
		//delete driver object once execution ends
		try {
			System.out.println("Closing session.");
			driver.quit();			
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in setting driver instance to null: deleteDriverInstance()");
			throw t;
		}
		finally
		{
			driver = null;
			driverFactoryInstance = null;
		}
	}

}
