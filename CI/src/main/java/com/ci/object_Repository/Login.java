package com.ci.object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	@FindBy(xpath="//a[@title=\"Sign In\"]//span") WebElement Sign_In;
	
	@FindBy(xpath="(//input[@id=\"email\"])[1]") WebElement Email_textbox;
	
	@FindBy(xpath="(//input[@id=\"password\"])[1]") WebElement password_textbox;
	
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement Sign_in_submit;
	
	@FindBy(xpath="//button[@id=\"onetrust-accept-btn-handler\"]") WebElement cookies;
	
	@FindBy(xpath="//div[@id=\"PW\"]") WebElement WrongPassword;
	
	//add comment
	public void click_cookies()
	{
		
		cookies.click();;
	}
	//add comment
	public void click_signin()
	{
		
		Sign_In.click();;
	}
	//add comment
	public void emailid(String emailaddress)
	{
		
		Email_textbox.sendKeys(emailaddress);
	}
	//add comment
	public void secure_password(String pass)
	{
		
		password_textbox.sendKeys(pass);
	}
	
	
	public void click_signin_submit()
	{
		
		Sign_in_submit.click();
	}
	
	public String getpassworderror()
	{
		
		return WrongPassword.getText();
	}

}

