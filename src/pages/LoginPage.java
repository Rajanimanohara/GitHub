package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
     
	//Initialization
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	//Utilization
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public String verifyErrorMsg()
	{
		verifyElement(errMsg);
		String aErrMsg = errMsg.getText();
		return aErrMsg;
	}
	public String verifyVersion()
	{
		String aVersion = version.getText();
		return aVersion;
	}
}
