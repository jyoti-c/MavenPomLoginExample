package pageobjects.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class GmailPage extends BasePage{
	@FindBy(xpath="//input[@type='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	public boolean enterEmail(String email) throws Exception{
		return webDriverClient.setTextAndEnter(userName, email);
	}
	
	public boolean enterPassword(String input_pass) throws Exception{
		webDriverClient.waitForElementToBeClickable(password);
		return webDriverClient.setTextAndEnter(password, input_pass);
	}

	public GmailPage(WebDriver driver) {
		super(driver);
			}

}
