package com.crm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

import junit.framework.Assert;

public class SignUpPageTest extends TestBase {
SignUpPage signUpPage;
//LoginPage loginPage;
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 signUpPage=new SignUpPage();
		
	}
	@Test(priority=1)
	public void validateSignUpTest()
	{
	boolean flagSign=signUpPage.validateTheSignUpButton();
	Assert.assertTrue(flagSign);
	System.out.println("SignUpButton Present");
	}
	@Test(priority=2)
	public void validateLoginTest() {
		boolean flagSign=signUpPage.validateTheLoginButton();
		Assert.assertTrue(flagSign);
		System.out.println("LoginButton Present");
	}
	
	
//@AfterMethod
	//public void quit()
	//{
		//driver.quit();
		
	//}

}
