package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ExcelData;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test
	public void testInvalidLogin() throws Exception
	{
		String loginTitle=ExcelData.getData(file_path, "Sheet1", 1, 2);
		String eErrMsg = ExcelData.getData(file_path, "Sheet1", 1, 4);
		int loginRC = ExcelData.getRowCount(file_path, "Sheet1");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.verifyTheTitle(loginTitle);
		Reporter.log("=================",true);
		for(int i=2;i<=loginRC;i++)
		{
			String user = ExcelData.getData(file_path, "Sheet1", i,0 );
			String pass = ExcelData.getData(file_path, "Sheet1", i,0 );

			ExcelData.getData(file_path, "Sheet1", i,1);
			Reporter.log("User Name:"+user,true);
			lp.enterUsername(user);
			lp.enterPassword(pass);
			Reporter.log("Password:"+pass,true);
			lp.clickOnLogin();
			Thread.sleep(2000);
			
			String aErrMsg = lp.verifyErrorMsg();
			Assert.assertEquals(aErrMsg, eErrMsg);
			Reporter.log("Message is Matching:"+eErrMsg,true);
			Reporter.log("=================",true);
		}}}
