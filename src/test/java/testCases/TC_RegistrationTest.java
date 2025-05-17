package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageobjects.HomePage;
import pageobjects.RegistrationPage;

public class TC_RegistrationTest extends BaseClass {
	
	 @Test(groups = "Regression")
    public void registrtionVerification() {
		 
		     logger.info("***** Starting Registration Test Started ****** ");
     		try { 
     		 HomePage homePage = new HomePage(driver);
     		 homePage.clickRegisterLink();
     		 logger.info("***** Registration Page Opened ****** ");
     		 
     		RegistrationPage registrationPage = new RegistrationPage(driver);
     		
     		logger.info("***** Filling Registration Form ****** ");
     		
     		registrationPage.enterFirstName(randomString().toUpperCase());
     		registrationPage.enterLastName(randomString());
     		registrationPage.enterAddressStreet("123 Main St");
     		registrationPage.enterAddressCity("Anytown");
     		registrationPage.enterAddressState("CA");
     		registrationPage.enterAddressZipCode("12345");
     		registrationPage.enterPhoneNumber(randomNumber());
     		registrationPage.enterSsn(randomSSN());
     		registrationPage.enterUserName(randomUsername());
     		
     		
     		String password = StringAlphaNumeric();
     		
     		registrationPage.enterPassword(password);
     		registrationPage.enterConfirmPassword(password);
     		
     		registrationPage.clickRegisterButton();
     		
     		logger.info("***** Registration Form Submitted ****** ");
     		logger.info("***** Verifying Registration Success Message ****** ");
     		String confirmmessage = registrationPage.getRegistrationSuccessMessage();
     		Assert.assertEquals(confirmmessage, "Your account was created successfully. You are now logged in.");
     		}
	 		catch (Exception e) {
	 			logger.error("***** Registration Test Failed ****** ");
	 			//logger.debug("***** Registration Test Failed ****** "+e.getMessage());
	 			Assert.fail();
	 		}
		 logger.info("***** Registration Test Passed ****** ");
	 }
     	 
}        

