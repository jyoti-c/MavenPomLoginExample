package tests;

import org.testng.annotations.Test;

import core.BaseTest;
import pageobjects.desktop.GmailPage;

public class TestIS extends BaseTest{

	protected TestIS(String platform) {
		super("desktopWeb");
	}
	
	GmailPage gmail = null;
	@Test()
	public void test() throws Exception {
		
		gmail = new GmailPage(driver);
		gmail.enterEmail("email");
		gmail.enterPassword("password");
		Thread.sleep(5000);
	}

}
