package StepDefinitions;

import org.openqa.selenium.WebDriver;

import common.BaseFunctions;
import common.GenericFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class Menu 
{
	public BaseFunctions baseObj = new BaseFunctions();
	public WebDriver driver = baseObj.driver;
	public HomePage homeObject = new HomePage(driver);
	
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
