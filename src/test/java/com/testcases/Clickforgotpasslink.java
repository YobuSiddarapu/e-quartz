package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.ForgotPasswordlinkVisible;
import com.pom.Forgotpasswordlinkclick;
import com.pom.LoginFunctionality;

public class Clickforgotpasslink extends TestBase{
	
	LoginFunctionality lf;
	Forgotpasswordlinkclick forgo;
	
	public Clickforgotpasslink() {
		super();
	}
	@BeforeMethod
	public void setup1() {
		initialization();
		lf=new LoginFunctionality();
		forgo=new Forgotpasswordlinkclick();
	}
	
	@Test
	public void Isclick() {
		lf.Verifylogin();
		forgo.Setup1();
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl,"https://e-quarz.com/customer/auth/recover-password");
	}
	@AfterMethod
	public void teardown() {
		
	}


}
