package selenium;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
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
		driver.quit();
	}

}
