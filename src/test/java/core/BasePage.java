package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
	public WebDriverClient webDriverClient = null;

	DriverManagerFactory driverManagerFactory = null;
	@SuppressWarnings("rawtypes")
	protected WebDriver driver = null;
	public String currentURL = "";
	
	public BasePage(WebDriver driver) {
        this.driver = driver;
		PageFactory.initElements(driver, this);
		webDriverClient = new WebDriverClient(driver);
    }
	
	
	
}