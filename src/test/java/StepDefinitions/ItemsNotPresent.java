package StepDefinitions;

import org.openqa.selenium.WebDriver;

import common.BaseFunctions;
import common.GenericFunctions;
import io.cucumber.java.en.Then;
import pageObjects.DressesPage;

public class ItemsNotPresent {
	
	public BaseFunctions baseObj = new BaseFunctions();
	public WebDriver driver = baseObj.driver;
	public DressesPage dressObject = new DressesPage(driver);

	@Then("^user verifies \"(.*)\" is not present$")
	public void verifyDressesNotPresent(String dressName) throws Throwable 
	{
		try {
			switch (dressName) {
			case "Printed Dress Black $36.00":
				GenericFunctions.validateElementNotPresent(dressObject.getBlackDress());
				break;
			case "Printed Dress White $40.00":
				GenericFunctions.validateElementNotPresent(dressObject.getWhiteDress());
				break;
			}
			Thread.sleep(500);
		} 
		catch (Throwable t) 
		{
			t.printStackTrace();
			System.out.println("Error in validating dresses!");
			throw t;
		}
	}
}
