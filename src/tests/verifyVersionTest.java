package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ExcelData;
import pages.LoginPage;

public class verifyVersionTest extends BaseTest

{
	@Test
	public  void testVerifyVersion()
	{
		String loginTitle = ExcelData.getData(file_path, "Sheet1", 1, 2);
		String eVersion = ExcelData.getData(file_path, "Sheet1", 1, 3);
		LoginPage lp=new LoginPage(driver);
	    lp.verifyTheTitle(loginTitle);
		String aVersion = lp.verifyVersion();
		Assert.assertEquals(aVersion, eVersion);
		Reporter.log("version is matching:actual version is:"+aVersion,true);
		
	}

}
