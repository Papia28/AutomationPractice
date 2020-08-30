package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	private WebDriver driver = null;
	
	By dresses = By.xpath("(//a[text()='Dresses'])[2]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void hoverOnDresses() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(dresses)).perform();
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
			driver.findElement(dresses).click();
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
