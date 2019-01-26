package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	String elementUserName = "username";
	
	String loginButton = "mainButton";
	WebDriver driver;
	

	public  LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterUserName(String userName) {
		
		WebElement userNameTextBox = driver.findElement(By.id(elementUserName));
		userNameTextBox.sendKeys(userName);
		System.out.println("Username : "+userName);
	
	}
	
	public void enterPassowrd(String password) {
		
		WebElement PasswordTextBox = driver.findElement(By.id(""));
		
		System.out.println("Username : "+password);

	}
	
	public void clickSigninButton() {
		
		//signinButton.click();
		
	}


}
