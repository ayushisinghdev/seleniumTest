package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	public void failed() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src, new File("/home/ayushi/eclipse-workspace/Tue09/src/main/java/1Failed.png"));
			
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	

}}
