/**
 * 
 */
package com.ci.baseclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ci.utility.Browser_setup;

/**
 * @author vivek.sharma
 *
 * This is the baseclass to start and close the browser
 */
public class BaseClass_setup {
	
public static WebDriver driver;
	

     @BeforeClass
	public void  setupBrowser()
	{
		driver=Browser_setup.Start_browser(driver, "https://www.eurocarparts.com", "chrome");
	}
	
     @AfterClass
	public void  teardown()
	{
		Browser_setup.quitBrowser(driver);
	}

}
