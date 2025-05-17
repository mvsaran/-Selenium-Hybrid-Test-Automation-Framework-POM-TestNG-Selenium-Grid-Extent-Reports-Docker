package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {
	
	public AccountsPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators & pageobjects;
	
	@FindBy(xpath ="//h1[normalize-space()='Accounts Overview']")
	WebElement accountsOverview;
	
	@FindBy(xpath ="//a[normalize-space()='Log Out']")
	WebElement logoutButton;
	
	public boolean isMyAccountPageDisplayed() {
		
		try {
		return accountsOverview.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
    	public void clickLogoutButton() {
		logoutButton.click();
	}
}
