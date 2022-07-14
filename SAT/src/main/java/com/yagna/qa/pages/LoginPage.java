package com.yagna.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yagna.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="usernameField-inputEl")
	WebElement username;
	
	@FindBy(id="passwordField-inputEl")
	WebElement password;
	
	@FindBy(linkText="Login")
	WebElement LoginBtn;
	
	@FindBy(id="loginFrontPageImage")
	WebElement loginImage;
	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();	
	}
	
	public boolean validationImage() {
	    return loginImage.isDisplayed();
	}
	
	public DashboardPage loginApp(String un, String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new DashboardPage();
	}

}
