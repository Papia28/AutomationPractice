package assertions;

import org.testng.Assert;

public class Assertion {

	public static void notNullAssertion(Object obj)
	{
		try {
		Assert.assertNotNull(obj);
		System.out.println("Success! Value is not null!");
		}
		catch(Exception t)
		{
			System.out.println("Error! Not null assertion failed!");
			t.printStackTrace();
			throw t;
		}
	}
	
	public static void nullAssertion(Object obj)
	{
		try {
		Assert.assertNull(obj);
		System.out.println("Success! Value is null!");
		}
		catch(Exception t)
		{
			System.out.println("Error! Null assertion failed!");
			t.printStackTrace();
			throw t;
		}
	}
	
	public static void equalAssertion(String actual, String expected)
	{
		try {
			System.out.println("Actual: " + actual);
			System.out.println("Expected: " + expected);
		Assert.assertEquals(actual, expected);
		System.out.println("Success! Values match!");
		}
		catch(Exception t)
		{
			System.out.println("Error! Values are not same!");
			t.printStackTrace();
			throw t;
		}
	}
	
	public static void trueAssertion(boolean result)
	{
		try {
		Assert.assertTrue(result);
		System.out.println("Success! Value is true!");
		}
		catch(Exception t)
		{
			System.out.println("Error! True assertion failed!");
			t.printStackTrace();
			throw t;
		}
	}
}
