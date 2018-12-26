package com.dubli.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dubli.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page factory - OR
	
	@FindBy(linkText="Sign In")
	WebElement SignInLink;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Sign In']")
	WebElement SignInBtn;
	
	//Initializing page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String em, String pwd) {
		SignInLink.click();
		email.sendKeys(em);
		password.sendKeys(pwd);
		SignInBtn.click();
		return new HomePage();
		
	}
}
