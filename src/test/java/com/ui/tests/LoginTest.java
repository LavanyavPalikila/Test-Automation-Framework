package com.ui.tests;

import static com.constants.Browser.CHROME;

import static org.testng.Assert.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojos.User;
import com.utility.LoggerUtility;


@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest extends TestBase {

	
		
		@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
				dataProviderClass= com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginDataProvider")
		public void logintest(User user) {
		
		assertEquals(homePage.gotoLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Jatin Sharma");

	}
		
		@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
				dataProviderClass= com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginCSVDataProvider")
		public void loginCSVtest(User user) {
		
		assertEquals(homePage.gotoLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Jatin Sharma");

	}
		
		@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
				dataProviderClass= com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginExcelDataProvider",
				retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
		public void loginExceltest(User user) {
			
		assertEquals(homePage.gotoLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Lavanya");
		
	}


}
