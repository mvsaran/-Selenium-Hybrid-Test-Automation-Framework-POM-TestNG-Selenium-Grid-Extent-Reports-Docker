package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	//

	
	
	
	@FindBy(xpath ="//input[@id='customer.firstName']")
	WebElement firstName;
	
	@FindBy(xpath ="//input[@id='customer.lastName']")
	WebElement lastName;
	
	@FindBy(xpath ="//input[@id='customer.address.street']")
	WebElement addressStreet;
	
	@FindBy(xpath ="//input[@id='customer.address.city']")
	WebElement addressCity;
	
	@FindBy(xpath ="//input[@id='customer.address.state']")
	WebElement addressState;
	
	@FindBy(xpath ="//input[@id='customer.address.zipCode']")
	WebElement addressZipCode;
	
	@FindBy(xpath ="//input[@id='customer.phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath ="//input[@id='customer.ssn']")
	WebElement ssn;
	
	@FindBy(xpath ="//input[@id='customer.username']")
	WebElement userName;
	
	@FindBy(xpath ="//input[@id='customer.password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='repeatedPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath ="//input[@value='Register']")
	WebElement register;
	
	
	@FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
	WebElement registrationSuccessMessage;
	
	public void enterFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public void enterAddressStreet(String addressStreet) {
		this.addressStreet.sendKeys(addressStreet);
	}
	public void enterAddressCity(String addressCity) {
		this.addressCity.sendKeys(addressCity);
	}
	public void enterAddressState(String addressState) {
		this.addressState.sendKeys(addressState);
	}
	public void enterAddressZipCode(String addressZipCode) {
		this.addressZipCode.sendKeys(addressZipCode);
	}
	public void enterPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}
	public void enterSsn(String ssn) {
		this.ssn.sendKeys(ssn);
	}
	public void enterUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	public void enterConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}
	public void clickRegisterButton() {
		register.click();
	}
	
	
	public String getRegistrationSuccessMessage() {
		try {
		return registrationSuccessMessage.getText();
		}
		catch (Exception e) {
			return (e.getMessage());
		}
	}
}
