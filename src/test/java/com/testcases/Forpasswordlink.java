package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.ForgotPasswordlinkVisible;
import com.pom.LoginFunctionality;

public class Forpasswordlink extends TestBase{
	LoginFunctionality lf;
	ForgotPasswordlinkVisible forgotpass;
	
	public Forpasswordlink() {
		super();
	}
	@BeforeMethod
	public void setup1() {
		initialization();
		lf=new LoginFunctionality();
		forgotpass=new ForgotPasswordlinkVisible();
	}
	
	@Test
	public void Isvisible() {
		lf.Verifylogin();
		forgotpass.Setup();
	}
	@AfterMethod
	public void teardown() {
		
	}

}
