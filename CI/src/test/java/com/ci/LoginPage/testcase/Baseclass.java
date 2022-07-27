/**
 * 
 */
package com.ci.LoginPage.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ci.baseclasses.BaseClass_setup;
import com.ci.object_Repository.Login;
import com.ci.utility.Browser_setup;

/**
 * @author vivek.sharma
 *
 *This is the base class of login
 */  
public class Baseclass extends BaseClass_setup {
	
	
	@Test
	
	public static  void Logininpage()
	{
	
	

	
	Login login=PageFactory.initElements(driver, Login.class);
	
	login.click_cookies();
	login.click_signin();
	login.emailid("ecptest1@netsolutions.com");
	login.secure_password("Tester123@4");
	login.click_signin_submit();

}
}
