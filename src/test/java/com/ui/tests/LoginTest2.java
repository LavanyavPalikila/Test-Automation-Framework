package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;

public class LoginTest2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Launching the web browser
		
		HomePage homePage = new HomePage(Browser.CHROME, false);
		
		homePage.maximizeWindow();
		homePage.gotoLoginPage();
		

	}

}
