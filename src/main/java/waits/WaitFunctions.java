package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitFunctions 
{
	public static WebDriver implicitWait(WebDriver driver) throws Throwable
	{
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in applying implicit wait!");
			throw t;
		}		
	}
}
