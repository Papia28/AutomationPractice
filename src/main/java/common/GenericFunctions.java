package common;

import org.openqa.selenium.WebDriver;

import assertions.Assertion;

public class GenericFunctions {
	
	public static void maximizeBrowser(WebDriver driver) throws Throwable
	{
		try {
			driver.manage().window().maximize();
			System.out.println("Success! Browser maximized!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in maximizing browser!");
			throw t;
		}
	}
	
	public static void validateTitle(WebDriver driver, String expectedTitle) throws Throwable
	{
		try {
			String actualTitle = driver.getTitle();
			String trueTitle = ReadProperties.getPropertyNamed(expectedTitle);
			Assertion.equalAssertion(actualTitle, trueTitle);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in validating title!");
			throw t;
		}
	}	
}
