package StepDefinitions;

import common.GenericFunctions;
import driverClasses.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DressPage;

public class ItemsPresentSteps 
{
	private DressPage dressObject = null;
	
	public ItemsPresentSteps(TestContext context)
	{
		try {
			dressObject = context.getPageObjectManager().getDressPage();
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
				GenericFunctions.validateElementPresent(dressObject.getPrintedDress1());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Dress $50.99":
				dressObject.hoverOnPrintedDress2();
				Thread.sleep(1000);
				GenericFunctions.validateElementPresent(dressObject.getPrintedDress2());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Summer Dress $28.98":
				dressObject.hoverOnsummerDress1();
				Thread.sleep(1000);
				GenericFunctions.validateElementPresent(dressObject.getSummerDress1());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Summer Dress $30.50":
				dressObject.hoverOnsummerDress2();
				Thread.sleep(1000);
				GenericFunctions.validateElementPresent(dressObject.getSummerDress2());
				System.out.println("Success! Dress Found!");
				break;
				
			case "Printed Chiffon Dress $16.40":
				dressObject.hoverOnchiffonDress();
				Thread.sleep(1000);
				GenericFunctions.validateElementPresent(dressObject.getChiffonDress());
				System.out.println("Success! Dress Found!");
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
