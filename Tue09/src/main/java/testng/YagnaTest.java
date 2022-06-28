package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class YagnaTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUP() throws InterruptedException, IOException {
		System.out.println("BeforeMethod started");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		System.out.println("browser open");
		driver.get("https://redington.yagnaiq.com");
		System.out.println("enter redington");
        driver.manage().window().maximize();
		System.out.println("max window");
        driver.manage().deleteAllCookies();
		System.out.println("del cookies");
        Thread.sleep(50000);
		System.out.println("wait for 50 sec");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/home/ayushi/eclipse-workspace/Tue09/src/main/java/1.png"));
		System.out.println("BeforeMethod end");
	}

	@Test(priority=1,groups="Display")
	public void displayTest() throws InterruptedException, IOException {
		System.out.println("Test1 started");
		System.out.println(driver);
		Boolean p1 = driver.findElement(By.id("usernameField-inputEl")).isDisplayed();
		System.out.println("Username "+p1);
		Boolean p2 = driver.findElement(By.id("passwordField-inputEl")).isDisplayed();
		System.out.println("Pwd "+p2);
		/*Boolean p3 = driver.findElement(By.id("loginButtonFrontView-btnE")).isDisplayed();
		System.out.println("Login "+p3);*/
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Test1 end");
	}
	
	@Test(priority=3,groups="Display")
	public void linkTest() throws InterruptedException, IOException {
		System.out.println("Test3 started");
		System.out.println(driver);
		Boolean p3 = driver.findElement(By.linkText("login")).isDisplayed();
		System.out.println("Login "+p3);
		System.out.println("Test3 end");
	}
	
	@Test(priority=2)
	public void yagnaTitleTest() throws InterruptedException, IOException {
		System.out.println("Test2 started");
		System.out.println(driver);
		driver.findElement(By.id("usernameField-inputEl")).sendKeys("ayushi.kumari@yagnaiq.com");
		System.out.println("enter username");
		driver.findElement(By.id("passwordField-inputEl")).sendKeys("Yagna123");
		System.out.println("enter pwd");
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.id("loginButtonFrontView-btnE")).click();
		System.out.println("login");
        Thread.sleep(50000);
		System.out.println("wait for 50 sec");
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("/home/ayushi/eclipse-workspace/Tue09/src/main/java/2.png"));
		driver.findElement(By.xpath("//*[@class='fa analyticsSmartLeadTileIconCls-new']")).click();
		System.out.println("lead listing");
        Thread.sleep(50000);
		System.out.println("wait for 50 sec");
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("/home/ayushi/eclipse-workspace/Tue09/src/main/java/3.png"));
		System.out.println("Test2 end");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException, IOException {
		System.out.println("AfterMethod started");
		driver.quit();
		System.out.println("AfterMethod end");
	}

}
