package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	//Declaration
	public WebDriver driver;
	
	//Initialization
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Utilization
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matching:"+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching:",true);
			Reporter.log("Actual Title is:"+driver.getTitle()+"Expected title is:"+eTitle,true);
			Assert.fail();
		}
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try
		{
			
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element Is Present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is Not Present",true);
			Assert.fail();
		}
				
		
		
	}
	
	
	
	
	
	

}
