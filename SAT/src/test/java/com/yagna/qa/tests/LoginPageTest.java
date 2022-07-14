package com.yagna.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yagna.qa.base.TestBase;
import com.yagna.qa.pages.DashboardPage;
import com.yagna.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	public LoginPageTest() throws IOException {
		super();
		System.out.println("after super");
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		System.out.println("initialization start");
		initialization();
		System.out.println("initialization done");
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Yagna");
		 
	}
	
	@Test(priority=2)
	public void yagnaLogoTest() {
		boolean flag = loginPage.validationImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException {
		dashboardPage = loginPage.loginApp(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
	
	
	

}
