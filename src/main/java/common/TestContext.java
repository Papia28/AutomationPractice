package common;

import org.openqa.selenium.WebDriver;
import driverClasses.DriverFactory;
import pageObjects.PageObjectManager;

public class TestContext 
{	
	private DriverFactory driverObject = null;
	private PageObjectManager pageObjectManager = null;
	private ScenarioContext scenarioContext = null;
	private WebDriver driver = null;
	
	public TestContext()
	{
		try {
			//get driver object
			this.driverObject = new DriverFactory();
			
			//initialize the scenarioContext
			this.scenarioContext = new ScenarioContext();
			
			//initialize pageobjectmanager class
			this.pageObjectManager = new PageObjectManager(driverObject.getDriver());
			
			//initialize driver
			this.driver = driverObject.getDriver();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating object: SeleniumContext.class");
		}
	}
	
	public DriverFactory driverFactory() throws Throwable
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
	
	public PageObjectManager pageObjectManager() throws Throwable
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
	
	public ScenarioContext scenarioContext() throws Throwable
	{
		try {
			return scenarioContext;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in getting scenario context.");
			throw t;
		}
	}
	
	public WebDriver webDriver() throws Throwable
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

