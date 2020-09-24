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
	
	public WebElement getPrintedDress1() throws Throwable 
	{
		try {
			System.out.println("Locating Printed Dress $26.00!");
			printedDress1.getTagName();
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
	
	public boolean validatePrintedDress1Present() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Dress $26.00!");
			printedDress1.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Failure! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return false;
		else
			return true;
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
	
	public WebElement getPrintedDress2() throws Throwable
	{
		try {
			System.out.println("Locating Printed Dress $50.99!");
			printedDress2.getTagName();
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
	
	public boolean validatePrintedDress2Present() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Dress $50.99!");
			printedDress2.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Failure! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return false;
		else
			return true;
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
	
	public WebElement getSummerDress1() throws Throwable
	{
		try {
			System.out.println("Locating Printed Summer Dress $28.98!");
			summerDress1.getTagName();
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
	
	public boolean validateSummerDress1Present() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Summer Dress $28.98!");
			summerDress1.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Failure! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return false;
		else
			return true;
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
	
	public WebElement getSummerDress2() throws Throwable
	{
		try {
			System.out.println("Printed Summer Dress $30.50!");
			summerDress2.getTagName();
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
	
	public boolean validateSummerDress2Present() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Printed Summer Dress $30.50!");
			summerDress2.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Failure! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return false;
		else
			return true;
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
	
	public WebElement getChiffonDress() throws Throwable
	{
		try {
			System.out.println("Locating Printed Chiffon Dress $16.40!");
			chiffonDress.getTagName();
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
	
	public boolean validateChiffonDressPresent() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Chiffon Dress $16.40!");
			chiffonDress.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Failure! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return false;
		else
			return true;
	}
	
	public boolean validateBlackDressNotPresent() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Dress Black $36.00!");
			blackDress.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Success! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return true;
		else
			return false;
	}
	
	public boolean validateWhiteDressNotPresent() throws Throwable
	{
		int flag = 0;
		try {
			System.out.println("Locating Printed Dress White $40.00!");
			whiteDress.getTagName();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Success! Element not found!");
			flag = 1;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Error with element!");
			throw t;
		}
		
		if(flag == 1)
			return true;
		else
			return false;
	}
}
