package StepDefinitions;

import org.openqa.selenium.WebDriver;

import common.GenericFunctions;
import common.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class MenuSteps 
{
	private WebDriver driver = null;
	private HomePage homeObject = null;
	
	public MenuSteps(TestContext context)
	{
		try {
			homeObject = context.getPageObjectManager().getHomePage();
			this.driver = context.getWebDriver();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in MenuSteps!");
		}
	}
	
	@When("^user goes to Dresses menu$")
	public void dressesMenu() throws Throwable
	{
		try {
			System.out.println("Moving to Dresses Menu.");
			homeObject.hoverOnDresses();
			Thread.sleep(100);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in locating Dresses menu!");
			throw t;
		}
	}
	
	@And("^user clicks on it$")
	public void menuClick() throws Throwable
	{
		try {
			System.out.println("Clicking on Dresses Menu.");
			homeObject.clickDresses();
			Thread.sleep(1000);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
				System.out.println("Error in clicking Dresses menu!");
				throw t;
			}
	}
	
	@Then("^Dresses page is displayed$")
	public void verifyDressesPage() throws Throwable
	{
		try {
			System.out.println("Validating Dresses page.");
			GenericFunctions.validateTitle(driver, "DressPageTitle");
			Thread.sleep(500);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
				System.out.println("Error in validating Dresses page!");
				throw t;
			}
	}

}
