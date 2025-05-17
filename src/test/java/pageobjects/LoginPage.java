package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//Login username and Password
	
	@FindBy(xpath ="//input[@name='username']")
	WebElement username;
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	@FindBy(xpath ="//input[@value='Log In']")
	WebElement loginButton;

	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
}
