package testng;

import org.testng.annotations.*;

public class testngBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("BeforeSuite - set up system properties for chrome");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("BeforeTest - login method");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass - launch browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("BeforeMethod - enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test - Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Test - search test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AfterMethod - logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass - close browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest - delete cookies");
	}
	
	@AfterSuite
	public void generateTestReports() {
		System.out.println("AfterSuite - generate reports");
	}

}
