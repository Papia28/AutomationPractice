package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{	
	private WebDriver driver = null;
	private HomePage homePage = null;
	private DressPage dressPage = null;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage getHomePage()throws Throwable
	{
		try {
			if(homePage == null)
				homePage = new HomePage(driver);
			return homePage;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating object of DressesPage.");
			throw t;
		}
	}
	
	public DressPage getDressPage()throws Throwable
	{
		try {
			if(dressPage == null)
				dressPage = new DressPage(driver);
			return dressPage;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in creating object of DressesPage.");
			throw t;
		}
	}
}
