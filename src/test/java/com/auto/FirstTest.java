package com.auto;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import PageObjects.LoginPage;

public class FirstTest {
	String url = "https://portal.mypearson.com";
	WebDriver driver;
	String userName = "lctest2";
	String passWord = "Password1";
	String homePageUrl = "https://portal.mypearson.com/course-home#/tab/active";
	

	@BeforeClass
	@Parameters({"browser"}) //xml parameter to select the browser
	public void browserSetup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/Resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
	}
	
	@Test
	public void mlmLogin() {
		LoginPage login = new LoginPage(driver);
		login.enterUserName(userName);
		login.enterPassowrd(passWord);
		
		//you can do the rest. :D 
		String currentPageUrl = driver.getCurrentUrl();
		//Assert.assertEquals(homePageUrl, currentPageUrl);
		
		
	}
}
