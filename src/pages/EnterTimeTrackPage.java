package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	public WebDriver driver;
	//Declaration
	@FindBy(xpath="//div[contains(@class,'_menu_icon support')]")
	private WebElement helpElement;
	@FindBy(xpath="//a[contains(.,'About')]")
	private WebElement aboutElement;
	@FindBy(xpath="//span[contains(.,'build')]")
	private WebElement closeElement;
	@FindBy(id="logoutLink")
	private WebElement logoutElement;
	
	//Initialization

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void ClickOnHelp1()
	{
		helpElement.click();
		aboutElement.click();
		closeElement.click();
	}
	public void clickOnLogout()
	{
		logoutElement.click();
	}
	
	
	
}








