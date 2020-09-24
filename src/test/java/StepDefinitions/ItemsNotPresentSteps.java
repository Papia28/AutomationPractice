package StepDefinitions;

import assertions.Assertion;
import common.TestContext;
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
				Assertion.trueAssertion(dressObject.validateBlackDressNotPresent());
				break;
			case "Printed Dress White $40.00":
				Assertion.trueAssertion(dressObject.validateWhiteDressNotPresent());
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
