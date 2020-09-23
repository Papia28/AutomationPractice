package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	
	private WebDriver driver = null;
	
	@FindBy(xpath="//span[contains(text(), '$36.00')]")
	private WebElement blackDress;
	
	@FindBy(xpath="//span[contains(text(), '$40.00')]")
	private WebElement whiteDress;
	
	@FindBy(xpath="//a[contains(text(), 'Printed Dress')]//following::span[contains(text(), '$26.00')]")
	private WebElement printedDress1;
	
	@FindBy(xpath="(//a[contains(text(), 'Printed Dress')]//following::span[contains(text(), '$50.99')])[2]")
	private WebElement printedDress2;
	
	@FindBy(xpath="//a[contains(text(), 'Printed Summer Dress')]//following::span[contains(text(), '$28.98')]")
	private WebElement summerDress1;
	
	@FindBy(xpath="(//a[contains(text(), 'Printed Summer Dress')]//following::span[contains(text(), '$30.50')])[2]")
	private WebElement summerDress2;
	
	@FindBy(xpath="//a[contains(text(), 'Printed Chiffon Dress')]//following::span[contains(text(), '$16.40')]")
	private WebElement chiffonDress;
	
	public DressPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnPrintedDress1() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(printedDress1).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public void hoverOnPrintedDress2() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(printedDress2).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public void hoverOnsummerDress1() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(summerDress1).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public void hoverOnsummerDress2() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(summerDress2).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public void hoverOnchiffonDress() throws Throwable
	{
		try {
		Actions action = new Actions(driver);
		action.moveToElement(chiffonDress).perform();
		System.out.println("Success! Element located!");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error in hovering on element!");
			throw t;
		}
	}
	
	public WebElement getPrintedDress1() throws Throwable 
	{
		try {
			System.out.println("Locating Printed Dress $26.00!");
		return printedDress1;
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("Error in locating element!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getPrintedDress2() throws Throwable
	{
		try {
			System.out.println("Locating Printed Dress $50.99!");
		return printedDress2;
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("Error in locating element!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getSummerDress1() throws Throwable
	{
		try {
			System.out.println("Locating Printed Summer Dress $28.98!");
		return summerDress1;
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("Error in locating element!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getSummerDress2() throws Throwable
	{
		try {
			System.out.println("Printed Summer Dress $30.50!");
		return summerDress2;
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("Error in locating element!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getChiffonDress() throws Throwable
	{
		try {
			System.out.println("Locating Printed Chiffon Dress $16.40!");
		return chiffonDress;
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("Error in locating element!");
			throw e;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getBlackDress() throws Throwable
	{
		try {
			System.out.println("Locating Printed Dress Black $36.00!");
		return blackDress;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Success! Element not found!");
			return null;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}
	
	public WebElement getWhiteDress() throws Throwable
	{
		try {
			System.out.println("Locating Printed Dress White $40.00!");
		return whiteDress;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Success! Element not found!");
			return null;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
	}

}
