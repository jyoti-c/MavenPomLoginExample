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
		gmail.enterEmail("bikkialtjkc@gmail.com");
		gmail.enterPassword("BikkialtJKC8");
		Thread.sleep(5000);
	}

}
