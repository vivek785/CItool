package com.ci.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_setup {
	
	WebDriver driver;
	public static WebDriver Start_browser(WebDriver driver,String url,String browser) {
		
		 if (browser.contains("chrome"))
			 
			 
			 
		 {
			 ChromeOptions options = new ChromeOptions();

			//Add chrome switch to disable notification - "**--disable-notifications**"
			options.addArguments("--disable-notifications");
			        
			//Set path for driver exe 
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

			//Pass ChromeOptions instance to ChromeDriver Constructor
		 driver =new ChromeDriver(options);
			 
			 
			 
			 
		 }
		 
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
		 
		 
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	

}
