package common;

import org.openqa.selenium.WebDriver;
import driverClasses.DriverFactory;

public class BaseFunctions 
{
	public WebDriver driver = null;
	
	public BaseFunctions()
	{
		try {
			DriverFactory driverObject = DriverFactory.getDriverFactoryObject();
			this.driver = driverObject.getDriver();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating object: BaseFunctions.class");
		}
	}
	
	public void launchApplicationURL() throws Throwable
	{
		try {
			if(ReadProperties.getURL() != null)
			{
				driver.get(ReadProperties.getURL());
				System.out.println("Success! URL launched!");
			}
			else
				throw new NullPointerException("Error in launching URL!");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("URL cannot be blank!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in launching URL!");
		}
	}
	
	public void closeSession() throws Throwable
	{		
		try {
			System.out.println("Closing session.");
			driver.quit();			
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in closing session");
		}
		finally {
			DriverFactory.deleteDriverInstance();		
		}
	}
	
	
}
