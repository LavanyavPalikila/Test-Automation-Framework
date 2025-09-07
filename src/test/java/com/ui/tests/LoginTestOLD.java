package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOLD {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Launching the web browser
	/*	BrowserUtility browserutility = new BrowserUtility(driver);
		
		browserutility.gotoWebSite("http://www.automationpractice.pl/index.php?");
		//maximize the window
		browserutility.maximizeWindow();
		

		By signInLinkLocator = By.xpath("//a[contains(text(),\'Sign\')]");
		browserutility.clickOn(signInLinkLocator);

		By emailTextBoxLocator = By.id("email");
		browserutility.enterText(emailTextBoxLocator, "bakomam596@skrak.com");

		By passwordTextBoxLocator = By.id("passwd");
		browserutility.enterText(passwordTextBoxLocator, "password");

		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserutility.clickOn(submitLoginButtonLocator);
*/
	}

}
