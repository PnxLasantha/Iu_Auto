package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Firefox
		/*
		System.setProperty("webdriver.gecko.driver", "src/Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://portal.mypearson.com";
		driver.get(url);
		Thread.sleep(3000);
		
		
		String elementUserName = "username";
		String elementPassWord = "password";
		String loginButton = "mainButton";
		String userName = "lctest2";
		String passWord = "Password1";
		
		
	/*	WebElement userNameTextBox = driver.findElement(By.id(elementUserName));
		userNameTextBox.sendKeys(userName);
		*/
		
		LoginPage login = new LoginPage(driver);
		login.enterUserName(userName);
		
		WebElement passWordTextBox = driver.findElement(By.id(elementPassWord));
		passWordTextBox.sendKeys(passWord);
				
		WebElement loginbutt = driver.findElement(By.id(loginButton));
		loginbutt.click();
		
		
		Thread.sleep(3000);

		driver.quit();
			
	}
	
	
}
