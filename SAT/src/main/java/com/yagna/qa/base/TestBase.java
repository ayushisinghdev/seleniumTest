package com.yagna.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException {
		
		prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/ayushi/eclipse-workspace/SAT/src/main/java/com/yagna/qa/config/config.properties");
		prop.load(ip);

		}
	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
		}
		//if firefox --- gecko.....
//     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		System.out.println("max window");
        driver.manage().deleteAllCookies();
		System.out.println("del cookies");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        System.out.println("enter url");
        driver.get(prop.getProperty("url"));
        System.out.println(prop.getProperty("url"));
        Thread.sleep(50000);
		System.out.println("wait for 50 sec");
        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
}
