package StepDefinitions;

import org.openqa.selenium.WebDriver;

import common.GenericFunctions;
import common.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class HomeSteps {

	private WebDriver driver = null;
	private TestContext context = null;
	private HomePage homePage = null;
	
	public HomeSteps(TestContext context)
	{		
		try {
			this.context = context;
			homePage = context.getPageObjectManager().getHomePage();
			driver = context.getWebDriver();
			System.out.println("Success! Browser opened!");
		} 
		catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error in opening session!");
		}
	}	
	
	@Given("^application is launched$")
	public void launchApplication() throws Throwable
	{
		try {			
			GenericFunctions.maximizeBrowser(driver);
			homePage.launchApplicationURL();	
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
			context.getDriverFactory().quitSession();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in closing session!");
			throw t;
		}
	}

}
