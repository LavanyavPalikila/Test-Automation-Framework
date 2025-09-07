package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;

public final class HomePage extends BrowserUtility{

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\'Sign\')]");
	
	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);
		//gotoWebSite(PropertiesUtil.readProperty(QA, "URL"));
		gotoWebSite(JSONUtility.readJson(QA).getUrl());
		}
	
	public HomePage(WebDriver driver) {
		super(driver);
		//gotoWebSite(PropertiesUtil.readProperty(QA, "URL"));
		gotoWebSite(JSONUtility.readJson(QA).getUrl());
		}
	
	public LoginPage gotoLoginPage() {
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
	
}
