package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ReadProperties;

public class HomePage {
	
	private WebDriver driver = null;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dresses;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchApplicationURL() throws Throwable
	{
		try {
			if(ReadProperties.getURL() != null)
			{
				driver.get(ReadProperties.getURL());
				System.out.println("Success! URL launched!");
			}
			else
				throw new NullPointerException("Error in launching URL!");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("URL cannot be blank!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in launching URL!");
			throw t;
		}
	}
	
	public void hoverOnDresses() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(dresses).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public void clickDresses() throws Throwable
	{
		try {
			dresses.click();
		System.out.println("Success! Element clicked!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in clicking element!");
			throw t;
		}
	}

}
