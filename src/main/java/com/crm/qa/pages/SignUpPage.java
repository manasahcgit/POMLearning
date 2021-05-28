package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	//Page Factory or Object Repository
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement signUpButton;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginButton;
	
	//Initializing the Page Factory
	
	public SignUpPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public boolean validateTheSignUpButton() {
		return signUpButton.isDisplayed();
		
	}
	
	public boolean validateTheLoginButton()
	{
		return loginButton.isDisplayed();
	}
	public void validateTheLoginButtonClick()
	{
		 loginButton.click();
	}
	
	
	

}
