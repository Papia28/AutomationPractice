package StepDefinitions;

import common.GenericFunctions;
import driverClasses.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DressPage;

public class ItemsNotPresentSteps 
{	
	private DressPage dressObject = null;
	
	public ItemsNotPresentSteps(TestContext context)
	{
		try {
			dressObject = context.getPageObjectManager().getDressPage();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in ItemsNotPresentSteps.");
		}
	}

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
