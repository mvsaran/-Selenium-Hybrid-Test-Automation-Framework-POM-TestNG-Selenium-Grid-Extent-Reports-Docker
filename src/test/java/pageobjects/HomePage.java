package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}


// Locators & pageobjects;
	
	
// Register link

@FindBy(xpath ="//a[normalize-space()='Register']")
WebElement registerLink;

public void clickRegisterLink() {
		registerLink.click();
	}

}