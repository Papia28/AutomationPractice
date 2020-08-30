package StepDefinitions;

import org.openqa.selenium.WebDriver;

import common.BaseFunctions;
import common.GenericFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home {
	
	public BaseFunctions baseObj = null;
	public WebDriver driver = null;
	
	@Before
	public void beforeScenario() throws Throwable
	{
		try {
			baseObj = new BaseFunctions();
			driver = baseObj.driver;		
			System.out.println("Success! Browser opened!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in opening session!");
			throw t;
		}
	}
	
	@Given("^application is launched$")
	public void launchApplication() throws Throwable
	{
		try {			
			GenericFunctions.maximizeBrowser(driver);
			baseObj.launchApplicationURL();	
			Thread.sleep(500);
		}
		catch(Throwable t)
		{
			System.out.println("Error in launching the application!");
			t.printStackTrace();
			throw t;
		}
	}
	
	@Then("^homepage is displayed$")
	public void homepageDisplayed() throws Throwable
	{
		try {
			System.out.println("Validating titl of home page.");
		GenericFunctions.validateTitle(driver, "HomePageTitle");
		Thread.sleep(100);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in validating home page title!");
			throw t;
		}
	}
	
	@After
	public void afterScenario() throws Throwable
	{
		try {
		baseObj.closeSession();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in closing session!");
			throw t;
		}
	}

}
