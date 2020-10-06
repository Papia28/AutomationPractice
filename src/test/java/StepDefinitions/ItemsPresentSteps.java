package StepDefinitions;

import assertions.Assertion;
import common.Context;
import common.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DressPage;

public class ItemsPresentSteps 
{
	private DressPage dressObject = null;
	private TestContext testContext = null;
	
	public ItemsPresentSteps(TestContext context)
	{
		try {
			testContext = context;
			dressObject = testContext.pageObjectManager().getDressPage();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in ItemsPresentSteps.");
		}
	}

	@Then("^user verifies \"(.*)\" is present$")
	public void verifyDressesPresent(String dressName) throws Throwable 
	{
		try {
			switch (dressName) 
			{
			case "Printed Dress $26.00":
				dressObject.hoverOnPrintedDress1();
				Thread.sleep(1000);
				Assertion.trueAssertion(dressObject.validatePrintedDress1Present());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Dress $50.99":
				dressObject.hoverOnPrintedDress2();
				Thread.sleep(1000);
				Assertion.trueAssertion(dressObject.validatePrintedDress2Present());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Summer Dress $28.98":
				dressObject.hoverOnsummerDress1();
				Thread.sleep(1000);
				Assertion.trueAssertion(dressObject.validateSummerDress1Present());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Summer Dress $30.50":
				dressObject.hoverOnsummerDress2();
				Thread.sleep(1000);
				Assertion.trueAssertion(dressObject.validateSummerDress2Present());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Chiffon Dress $16.40":
				dressObject.hoverOnchiffonDress();
				Thread.sleep(1000);
				Assertion.trueAssertion(dressObject.validateChiffonDressPresent());
				System.out.println("Success! Dress Found!");
				testContext.scenarioContext().setContext(Context.PRODUCT_NAME, "Printed Chiffon Dress $16.40");
				String dressName1 = (String) (testContext.scenarioContext().getContext(Context.PRODUCT_NAME));
				System.out.println("The dress name is : " + dressName1);
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
	
	@Then("^user displays the name of the item verified$")
	public void displayName() throws Throwable
	{
		try {
			String dressName = (String) (testContext.scenarioContext().getContext(Context.PRODUCT_NAME));
			System.out.println("The dress name is : " + dressName);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in displaying item name!");
			throw t;
		}
	}
}
