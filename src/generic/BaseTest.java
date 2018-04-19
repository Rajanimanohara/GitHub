package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()

	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		}
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int status =res.getStatus();
		String name=res.getMethod().getMethodName();
		if(status==2)
		{
			GenericUtils.getScreenShot(driver,name);
		}
		driver.close();
	}

}
