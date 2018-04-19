package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ExcelData;
import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{

	//@Test
	public void testValidLoginLogout()
	{
		String loginTitle = ExcelData.getData(file_path, "Sheet1", 1, 2);
		String user = ExcelData.getData(file_path, "Sheet1", 1, 0);;
		String pass = ExcelData.getData(file_path, "Sheet1", 1,1 );
		String timeTrackTitle = ExcelData.getData(file_path, "Sheet2", 1, 0);
		
		LoginPage lp=new LoginPage(driver);
		
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//Verify The Title
		lp.verifyTheTitle(loginTitle);
		
		//Enter Un
		Reporter.log("user name is:"+user,true);
		lp.enterUsername(user);
		
		//Enter Pw
		Reporter.log("passWord Is:"+pass,true);
		lp.enterPassword(pass);
		
		//Click On Login
		lp.clickOnLogin();
		
		//Verify ennter time track
		lp.verifyTheTitle(timeTrackTitle);
		
		ep.clickOnLogout();
		
		lp.verifyTheTitle(loginTitle);
		
		
	}
}
