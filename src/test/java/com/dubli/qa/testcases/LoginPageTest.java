package com.dubli.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dubli.qa.base.TestBase;
import com.dubli.qa.pages.HomePage;
import com.dubli.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Dubli: Your Leading Global Cash Back, Coupons and Deals Site");
	}
	
	@Test(priority=2)
	
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
