/**
 * 
 */
package com.ci.LoginPage.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ci.object_Repository.Login;
import com.ci.utility.Browser_setup;

/**
 * @author vivek.sharma
 *
 *  Validate with incorrect  email
 *
 */
public class TC002 {
	
	
	WebDriver driver;
	@Test
	
	public void Logininpage()
	{
		
		
		driver=Browser_setup.Start_browser(driver, "https://www.eurocarparts.com", "chrome");
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.click_cookies();
		login.click_signin();
		login.emailid("ecptest1@netsolutions.com");
		login.secure_password("Tester123@4");
		login.click_signin_submit();
	}


}
