package driverClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import waits.WaitFunctions;

public class DriverFactory extends DriverManager 
{
	private WebDriver driver = null;
	
	public DriverFactory()
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
	
	private void setSession() throws Throwable
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
	
	public void closeSession() throws Throwable
	{
		//delete driver object once execution ends
		try {
			System.out.println("Closing session.");
			driver.close();			
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
		}
	}

}
