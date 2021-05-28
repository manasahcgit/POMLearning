package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement eMail;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginButton;
	
	public void LoginButtonClick()
	{
		loginButton.click();
		
	}
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTiltle() {
		return driver.getTitle();
	}
	
	public HomePage enterDetails(String uName, String pwd) {
		eMail.sendKeys(uName);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
	
	
	
	
}
