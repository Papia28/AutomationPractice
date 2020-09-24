package common;

import org.openqa.selenium.WebDriver;
import driverClasses.DriverFactory;
import pageObjects.PageObjectManager;

public class TestContext {
	
	private DriverFactory driverObject = null;
	private PageObjectManager pageObjectManager = null;
	private WebDriver driver = null;
	
	public TestContext()
	{
		try {
			//get singleton driver object
			this.driverObject = DriverFactory.getDriverFactoryObject();
			
			//initialize driver
			this.driver = driverObject.getDriver();
			
			//initialize pageobjectmanager class
			this.pageObjectManager = new PageObjectManager(driverObject.getDriver());
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating object: SeleniumContext.class");
		}
	}
	
	public DriverFactory getDriverFactory() throws Throwable
	{
		try {
			return driverObject;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in getting driver object.");
			throw t;
		}
	}
	
	public PageObjectManager getPageObjectManager() throws Throwable
	{
		try {
			return pageObjectManager;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in getting driver object.");
			throw t;
		}
	}
	
	public WebDriver getWebDriver() throws Throwable
	{
		try {
			return driver;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in getting driver object.");
			throw t;
		}
	}
}

