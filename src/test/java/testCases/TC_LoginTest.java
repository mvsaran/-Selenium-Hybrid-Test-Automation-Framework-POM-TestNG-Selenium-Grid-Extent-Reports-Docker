package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountsPage;
import pageobjects.LoginPage;

public class TC_LoginTest extends BaseClass{
	
	@Test(groups = "Sanity")
	public void verifyLogin() 
	{
		logger.info("***** Starting Login Test ****** ");
		try
		{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(properties.getProperty("username"));
		loginPage.enterPassword(properties.getProperty("password"));
		loginPage.clickLoginButton();
		
		AccountsPage accountPage = new AccountsPage(driver);
		boolean targetPage = accountPage.isMyAccountPageDisplayed();
		Assert.assertTrue(targetPage);
		}
		catch (Exception e)
		{
			logger.error("***** Login Test Failed ****** ");
			Assert.fail();
		}
		
		logger.info("***** Login Test Passed ****** ");
	}

}
