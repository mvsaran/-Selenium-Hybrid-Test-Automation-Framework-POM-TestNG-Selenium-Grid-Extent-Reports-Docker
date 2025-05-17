package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountsPage;
import pageobjects.LoginPage;
import utilities.DataProviders;

public class TC_DatadrivenLoginTest extends BaseClass

{
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups ="Datadriven")
	public void verifyLogin(String username,String password,String result) 
	{
		logger.info("***** Starting Data Driven Login Test ****** ");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		
		AccountsPage accountPage = new AccountsPage(driver);
		boolean targetPage = accountPage.isMyAccountPageDisplayed();
		
		// Data is valid
		if(result.equalsIgnoreCase("Valid"))
		{
			if(targetPage == true)
			{
				
				accountPage.clickLogoutButton();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		// Data is invalid
		if(result.equalsIgnoreCase("Invalid"))
		{
			if(targetPage == true)
			{
				accountPage.clickLogoutButton();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
			
		}
		
		logger.info(" Data Driven testing completed ");
	}
	
}
